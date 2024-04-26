package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Comentario_Cliente_Taller;

import java.util.List;

@Repository
public interface IComentario_Cliente_TallerRepository extends JpaRepository <Comentario_Cliente_Taller, Integer>
{

    @Query(value="SELECT T.id_taller,T.nombre_taller,T.telefono,T.direccion, AVG(CT.calificacion) AS PromedioCalificacion \n" +
            "FROM taller T \n" +
            "INNER JOIN comentario_cliente_taller CT ON T.id_taller = CT.taller_id \n" +
            "GROUP BY T.id_taller,T.nombre_taller,T.telefono, T.direccion \n" +
            "HAVING AVG(CT.calificacion) >= 8 \n" +
            "ORDER BY PromedioCalificacion DESC;", nativeQuery = true)
    public List<String[]> ListarMejoresTalleres();


    @Query(value="SELECT T.id_taller,T.nombre_taller, AVG(CT.calificacion) AS PromedioCalificacion \n" +
            "FROM TALLER T \n" +
            "LEFT JOIN comentario_cliente_taller CT ON T.id_taller = CT.taller_id \n" +
            "GROUP BY T.id_taller, T.nombre_taller \n" +
            "ORDER BY PromedioCalificacion DESC;", nativeQuery = true)
    public List<String[]> PromedioTalleres();


    @Query(value="SELECT T.id_taller, T.nombre_taller, AVG(CT.calificacion) AS PromedioCalificacion \n" +
            "FROM TALLER T \n" +
            "LEFT JOIN comentario_cliente_taller  CT ON T.id_taller = CT.taller_id \n" +
            "GROUP BY T.id_taller, T.nombre_taller \n" +
            "ORDER BY PromedioCalificacion DESC \n" +
            "LIMIT 5;", nativeQuery = true)
    public List<String[]> Top5Talleres();

}
