package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.DispositivoTaller;
import pe.edu.upc.techsos.repositories.IDispositivoTallerRepository;
import pe.edu.upc.techsos.servicesinterfaces.IDispositivoTallerService;

import java.util.List;

@Service
public class DispositivoTallerServiceImplement implements IDispositivoTallerService {
    @Autowired
    private IDispositivoTallerRepository dtR;

    @Override
    public void insert(DispositivoTaller dispositivoTaller) {
        dtR.save(dispositivoTaller);
    }

    @Override
    public List<DispositivoTaller> list() {
        return dtR.findAll();
    }

    @Override
    public void delete(int id) {
        dtR.deleteById(id);
    }

    @Override
    public DispositivoTaller listid(int id) {
        return dtR.findById(id).orElse(new DispositivoTaller());
    }
}
