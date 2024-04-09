package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.Marca;

import java.util.List;

public interface IMarcaService {
    void insert(Marca marca);

    List<Marca> list();
    void delete(int id);
    Marca listid(int id);

}
