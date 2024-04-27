package pe.edu.upc.techsos.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.techsos.entities.Taller;

import java.util.List;

public interface ITallerService {
    void insert(Taller taller);

    List<Taller> list();
    void delete(int id);

    Taller listid(int id);

    public List<Taller> listTalleres(String distrito);


}