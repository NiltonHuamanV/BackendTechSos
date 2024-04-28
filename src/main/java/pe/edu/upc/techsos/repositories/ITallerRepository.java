package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.dtos.TallerDTO;
import pe.edu.upc.techsos.entities.Taller;

import java.util.List;

@Repository
public interface ITallerRepository extends JpaRepository <Taller,Integer> {
    @Query("select sum(r.Costo) from Reparacion  r join DispositivoTaller dt " +
            "on dt.idDispositivoTaller=r.dispositivoTaller.idDispositivoTaller where dt.taller.idTaller=:id")
    public List<String[]> getPosiblesGananciasPorTaller();
    @Query("select t from Taller t where t.district.idDistrict=:id")
    public List<Taller> getTallerPorDistrito(@Param("id") int distritoId);
    @Query("select t.idTaller,t.nombre, avg(cm.calificacion) from Taller t join Comentario_Cliente_Taller cm " +
            "on cm.taller.idTaller=t.idTaller group by t.idTaller,t.nombre order by avg(cm.calificacion) DESC")
    public List<Taller> getTalleresMejorPuntuacion();
}
