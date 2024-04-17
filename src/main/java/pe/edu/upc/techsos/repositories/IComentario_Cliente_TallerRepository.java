package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Comentario_Cliente_Taller;
@Repository
public interface IComentario_Cliente_TallerRepository extends JpaRepository <Comentario_Cliente_Taller, Integer> {
}
