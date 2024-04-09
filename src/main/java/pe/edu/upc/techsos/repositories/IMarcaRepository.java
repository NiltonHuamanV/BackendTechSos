package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Marca;

@Repository
public interface IMarcaRepository extends JpaRepository<Marca,Integer> {
}
