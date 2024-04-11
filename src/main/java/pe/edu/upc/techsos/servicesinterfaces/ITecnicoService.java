package pe.edu.upc.techsos.servicesinterfaces;
import pe.edu.upc.techsos.entities.Tecnico;

import java.util.List;

public interface ITecnicoService {
    void insert(Tecnico tecnico);

    List<Tecnico> list();
    void delete(int id);

    Tecnico listid(int id);
}
