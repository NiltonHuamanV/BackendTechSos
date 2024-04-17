package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.DispositivoTaller;
@Repository
public interface IDispositivoTallerRepository extends JpaRepository<DispositivoTaller, Integer> {
}
