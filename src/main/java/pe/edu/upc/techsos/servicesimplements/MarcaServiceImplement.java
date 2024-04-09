package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Marca;
import pe.edu.upc.techsos.repositories.IMarcaRepository;
import pe.edu.upc.techsos.servicesinterfaces.IMarcaService;

import java.util.List;

@Service
public class MarcaServiceImplement implements IMarcaService {
    @Autowired
    private IMarcaRepository dR;
    @Override
    public void insert(Marca marca) {dR.save(marca);}
    @Override
    public List<Marca> list() { return dR.findAll();}

    @Override
    public void delete(int id) {
        dR.deleteById(id);

    }
    @Override
    public Marca listid(int id) {
        return dR.findById(id).orElse(new Marca());
    }

}