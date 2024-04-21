package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.Dispositivo;

import java.util.List;

public interface IDispositivoService {
    public void insert(Dispositivo dispositivo);
    public List<Dispositivo> list();
    public void delete (int id);
    public Dispositivo listid(int id);

    public List<String[]> sumDispositivosPorTallerYEstado();

    public List<String[]> sumDispositivosPorTallerMarcaModelo();
}
