package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.Reparacion;

import java.util.List;

public interface IReparacionService {

    public void insert(Reparacion reparacion);
    public List<Reparacion> list();
}
