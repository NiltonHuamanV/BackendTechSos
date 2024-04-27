package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Taller;

import java.util.List;

@Repository
public interface ITallerRepository extends JpaRepository <Taller,Integer> {
    @Query("from Taller r where r.district.name=:distrito")
    public List<Taller> listTalleres(@Param("distrito") String distrito);

}
