package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.techsos.entities.Modelo;

public interface IModeloRepository extends JpaRepository<Modelo,Integer> {
}
