package pe.edu.upc.techsos.servicesinterfaces;
import pe.edu.upc.techsos.entities.Modelo;
import java.util.List;

public interface IModeloService {
    void insert(Modelo modelo);

    List<Modelo> list();
    void delete(int id);
    Modelo listid(int id);

}