package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Dispositivo;
import pe.edu.upc.techsos.repositories.IDispositivoRepository;
import pe.edu.upc.techsos.servicesinterfaces.IDispositivoService;

import java.util.List;

@Service
public class DispositivoServiceImplement implements IDispositivoService {
@Autowired
private IDispositivoRepository dR;
    @Override
    public void insert(Dispositivo dispositivo) {dR.save(dispositivo);}
    @Override
    public List<Dispositivo> list() { return dR.findAll();}

    @Override
    public void delete(int id) {
        dR.deleteById(id);

    }
    @Override
    public Dispositivo listid(int id) {
        return dR.findById(id).orElse(new Dispositivo());
    }

    @Override
    public List<String[]> sumDispositivosPorTallerYEstado() {
        return dR.sumDispositivosPorTallerYEstado();
    }

    @Override
    public List<String[]> sumDispositivosPorTallerMarcaModelo() {
        return dR.sumDispositivosPorTallerMarcaModelo();
    }

}
