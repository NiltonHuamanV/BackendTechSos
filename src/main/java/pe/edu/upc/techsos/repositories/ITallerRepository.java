package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Taller;

import java.util.List;

@Repository
public interface ITallerRepository extends JpaRepository <Taller,Integer> {
    @Query("select sum(r.Costo) from Reparacion  r join DispositivoTaller dt " +
            "on dt.idDispositivoTaller=r.dispositivoTaller.idDispositivoTaller where dt.taller.idTaller=:id")
    public List<String[]> getPosiblesGananciasPorTaller();
}
