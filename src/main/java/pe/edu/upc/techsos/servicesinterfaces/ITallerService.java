package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.Taller;

import java.util.List;

public interface ITallerService {
    void insert(Taller taller);

    List<Taller> list();
    void delete(int id);

    Taller listid(int id);
    List<String[]> getPosibleGananciaPorTaller(int tallerId);
}