package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Taller;
import pe.edu.upc.techsos.entities.Tecnico;
import pe.edu.upc.techsos.repositories.ITallerRepository;
import pe.edu.upc.techsos.repositories.ITecnicoRepository;
import pe.edu.upc.techsos.servicesinterfaces.ITecnicoService;
import pe.edu.upc.techsos.shared.exceptions.ResourceNotFoundException;

import java.util.List;

@Service
public class TecnicoServiceImplement implements ITecnicoService {
    @Autowired
    private ITecnicoRepository dR;
    @Autowired
    private ITallerRepository tR;
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

    @Override
    public List<Tecnico> findByTaller(int idTaller) {
        Taller t = tR.findById(idTaller).orElseThrow(() -> new ResourceNotFoundException("Taller no existe"));
        return dR.findByTaller(t);
    }

}