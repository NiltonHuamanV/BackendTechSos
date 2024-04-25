package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.upc.techsos.entities.Dispositivo;

import java.util.List;

@Repository
public interface IDispositivoRepository extends JpaRepository<Dispositivo,Integer> {
    @Query(value = "select \n" +
            "    t.nombre_taller as Nombre_Taller, \n" +
            "    r.estado,\n" +
            "    count(dt.dispositivo_id) as Cantidad_Dispositivos \n" +
            "from \n" +
            "    Taller t \n" +
            "left join \n" +
            "    Dispositivo_Taller dt on t.id_taller = dt.taller_id \n" +
            "left join \n" +
            "    Reparacion r on dt.id_dispositivo_taller = r.dispositivo_taller_id \n" +
            "group by \n" +
            "t.nombre_taller, r.estado", nativeQuery = true)
    public List<String[]> sumDispositivosPorTallerYEstado();

    @Query(value = "select \n" +
            "    t.nombre_taller as Nombre_Taller, \n" +
            "    ma.nombre as Nombre_Marca, \n" +
            "    m.nombre as Nombre_Modelo, \n" +
            "    count(dt.id_dispositivo_taller) as Cantidad_Dispositivos \n" +
            "from \n" +
            "    Taller t \n" +
            "join \n" +
            "    Dispositivo_Taller dt on t.id_taller = dt.taller_id \n" +
            "join \n" +
            "    Dispositivo d on dt.dispositivo_id = d.id_dispositivo \n" +
            "join \n" +
            "    Modelo m on d.modelo_id = m.id_modelo \n" +
            "join \n" +
            "    Marca ma on m.marca_id = ma.id_marca \n" +
            "group by \n" +
            "    t.nombre_taller, ma.nombre, m.nombre;", nativeQuery = true)
    public List<String[]> sumDispositivosPorTallerMarcaModelo();
    @Query("select d.idDispositivo,d.modelo,r.Estado from Dispositivo d join DispositivoTaller dt on dt.dispositivo.idDispositivo=d.idDispositivo\n"+
    "join Reparacion r on dt.idDispositivoTaller=r.dispositivoTaller.idDispositivoTaller where d.idDispositivo=:id")
    public List<String[]> getEstadoDispositivoEnRepacion(@Param("id") Long dispositivo_id);
    @Query("select r.Estado,count(*) as cantidad from Reparacion r join DispositivoTaller dt on " +
            "r.dispositivoTaller.idDispositivoTaller=dt.idDispositivoTaller where dt.taller.idTaller=:id group by r.Estado")
    public List<String[]> getCantidadDispositivosPorEstado(@Param("id") Long tallerId);
}
