package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Reparacion;
import pe.edu.upc.techsos.repositories.IReparacionRepository;
import pe.edu.upc.techsos.servicesinterfaces.IReparacionService;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReparacionServiceImplements implements IReparacionService {
    @Autowired
    private IReparacionRepository rR;
    @Override
    public void insert(Reparacion reparacion) {rR.save(reparacion);}
    @Override
    public List<Reparacion> list(){return rR.findAll();}

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public List<String[]> cantidadDisipositivoReparacionFecha(LocalDate fecha_menor, LocalDate fecha_mayor) {
        return rR.cantidadDisipositivoReparacionFecha(fecha_menor,fecha_mayor);
    }

    @Override
    public List<String[]> recaudacionTotalPorMesyAnio(int anio, int mes) {
        return rR.recaudacionTotalPorMesyAnio(anio, mes);
    }

}
