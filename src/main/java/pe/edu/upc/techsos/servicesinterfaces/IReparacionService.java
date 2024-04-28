package pe.edu.upc.techsos.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.techsos.entities.Reparacion;

import java.time.LocalDate;
import java.util.List;

public interface IReparacionService {

    public void insert(Reparacion reparacion);
    public List<Reparacion> list();

    public void delete (int id);

    List<String[]>cantidadDisipositivoReparacionFecha(LocalDate fecha_menor, LocalDate fecha_mayor);

    List<String[]>recaudacionTotalPorMesyAnio(int anio, int mes);

}
