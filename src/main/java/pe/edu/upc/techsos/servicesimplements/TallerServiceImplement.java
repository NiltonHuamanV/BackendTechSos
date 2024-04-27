package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Taller;
import pe.edu.upc.techsos.repositories.ITallerRepository;
import pe.edu.upc.techsos.servicesinterfaces.ITallerService;

import java.util.List;

@Service
public class TallerServiceImplement implements ITallerService {
    @Autowired
    private ITallerRepository dR;
    @Override
    public void insert(Taller taller) {dR.save(taller);}
    @Override
    public List<Taller> list() { return dR.findAll();}

    @Override
    public void delete(int id) {
        dR.deleteById(id);
    }
    @Override
    public Taller listid(int id) {
        return dR.findById(id).orElse(new Taller());
    }

    @Override
    public List<Taller> listTalleres(String distrito) {
        return dR.listTalleres(distrito);
    }

}