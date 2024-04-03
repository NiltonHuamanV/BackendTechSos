package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.District;
@Repository
public interface IDistrictRepository extends JpaRepository<District,Integer> {
}