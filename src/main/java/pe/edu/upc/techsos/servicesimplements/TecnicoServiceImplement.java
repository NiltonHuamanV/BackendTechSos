package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Tecnico;
import pe.edu.upc.techsos.repositories.ITecnicoRepository;
import pe.edu.upc.techsos.servicesinterfaces.ITecnicoService;

import java.util.List;

@Service
public class TecnicoServiceImplement implements ITecnicoService {
    @Autowired
    private ITecnicoRepository dR;
    @Override
    public void insert(Tecnico tecnico) {dR.save(tecnico);}
    @Override
    public List<Tecnico> list() { return dR.findAll();}

    @Override
    public void delete(int id) {
        dR.deleteById(id);
    }
    @Override
    public Tecnico listid(int id) {
        return dR.findById(id).orElse(new Tecnico());
    }

}