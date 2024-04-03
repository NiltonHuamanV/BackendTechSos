package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Dispositivo;

import java.util.List;

@Repository
public interface IDispositivoRepository extends JpaRepository<Dispositivo,Integer> {
public List<Dispositivo> findByMarca(String marca);
}
