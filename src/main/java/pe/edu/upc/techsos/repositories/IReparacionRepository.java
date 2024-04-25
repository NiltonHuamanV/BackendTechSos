package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Reparacion;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IReparacionRepository extends JpaRepository<Reparacion,Integer> {
    @Query(value = "Select r.fecha_inicio, count(*) \n" +
            "From Reparacion r inner join Dispositivo_taller dt on r.dispositivo_taller_id = dt.id_dispositivo_taller \n" +
            "inner join Dispositivo d on d.id_dispositivo = dt.dispositivo_id where r.fecha_inicio Between :fecha_menor and :fecha_mayor \n" +
            "group by r.fecha_inicio", nativeQuery = true)
    List<String[]>cantidadDisipositivoReparacionFecha(@Param("fecha_menor") LocalDate fecha_menor, @Param("fecha_mayor") LocalDate fecha_mayor);

    @Query(value = "Select Extract(YEAR FROM r.fecha_inicio) as anio, Extract(MONTH FROM r.fecha_inicio) as mes,\n" +
            "sum(r.costo) as recaudacion_total from Reparacion r Where Extract(YEAR FROM r.fecha_inicio) =:anio and \n" +
            "Extract(MONTH FROM r.fecha_inicio) =:mes group by anio, mes", nativeQuery = true)
    List<String[]>recaudacionTotalPorMesyAnio(@Param("anio") int anio, @Param("mes") int mes);

}
