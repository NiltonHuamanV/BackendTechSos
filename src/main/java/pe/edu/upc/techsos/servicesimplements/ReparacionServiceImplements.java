package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Reparacion;
import pe.edu.upc.techsos.repositories.IReparacionRepository;
import pe.edu.upc.techsos.servicesinterfaces.IReparacionService;

import java.util.List;

@Service
public class ReparacionServiceImplements implements IReparacionService {
    @Autowired
    private IReparacionRepository rR;
    @Override
    public void insert(Reparacion reparacion) {rR.save(reparacion);}
    @Override
    public List<Reparacion> list(){return rR.findAll();}
}
