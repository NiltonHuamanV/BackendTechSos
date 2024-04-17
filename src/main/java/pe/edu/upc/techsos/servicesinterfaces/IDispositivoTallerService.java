package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.DispositivoTaller;

import java.util.List;

public interface IDispositivoTallerService {
    public void insert(DispositivoTaller dispositivoTaller);

    public List<DispositivoTaller> list();

    public void delete (int id);

    public DispositivoTaller listid(int id);
}
