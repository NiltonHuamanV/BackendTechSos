package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.upc.techsos.entities.Modelo;
import pe.edu.upc.techsos.repositories.IModeloRepository;
import pe.edu.upc.techsos.servicesinterfaces.IModeloService;

import java.util.List;

@Service
public class ModeloServiceImplement implements IModeloService {
    @Autowired
    private IModeloRepository dR;
    @Override
    public void insert(Modelo modelo) {dR.save(modelo);}
    @Override
    public List<Modelo> list() { return dR.findAll();}

    @Override
    public void delete(int id) {
        dR.deleteById(id);

    }
    @Override
    public Modelo listid(int id) {
        return dR.findById(id).orElse(new Modelo());
    }

}
