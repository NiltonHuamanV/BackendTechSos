package pe.edu.upc.techsos.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.CantidadDispositivo_Fecha_Reparacion;
import pe.edu.upc.techsos.dtos.RecaudacionTotal_Por_Año_Mes;
import pe.edu.upc.techsos.dtos.ReparacionDTO;
import pe.edu.upc.techsos.entities.Reparacion;
import pe.edu.upc.techsos.servicesinterfaces.IReparacionService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reparacion")
public class ReparacionController {
    @Autowired
    private IReparacionService rS;
    @PostMapping
    public void insertar (@RequestBody ReparacionDTO reparacionDTO)
    {
        ModelMapper d = new ModelMapper();
        Reparacion reparacion = d.map(reparacionDTO, Reparacion.class);
        rS.insert(reparacion);
    }
    @GetMapping
    public List<ReparacionDTO> Listar()
    {
        return rS.list().stream().map(y-> {
            ModelMapper m= new ModelMapper();
            return m.map(y,ReparacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        rS.delete(id);
    }

    @GetMapping("/cantidad_dispositivo_fecha")
    public List<CantidadDispositivo_Fecha_Reparacion> cantidadDispositivoFechaReparaciones(@RequestParam LocalDate fecha_menor, LocalDate fecha_mayor)
    {
        List<String[]> filalista = rS.cantidadDisipositivoReparacionFecha(fecha_menor,fecha_mayor);
        List<CantidadDispositivo_Fecha_Reparacion> dtoLista = new ArrayList<>();
        for(String[] columna:filalista)
        {
            CantidadDispositivo_Fecha_Reparacion dto = new CantidadDispositivo_Fecha_Reparacion();
            dto.setFecha_inicio(LocalDate.parse(columna[0]));
            dto.setCantidad_dispo(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
    @GetMapping("/recaudacion_por_anio_mes")
    public List<RecaudacionTotal_Por_Año_Mes> recaudacionTotalPorAñoMes(@RequestParam int anio, int mes)
    {
        List<String[]> filalista = rS.recaudacionTotalPorMesyAnio(anio,mes);
        List<RecaudacionTotal_Por_Año_Mes> dtoLista = new ArrayList<>();
        for(String[] columna:filalista)
        {
            RecaudacionTotal_Por_Año_Mes dto = new RecaudacionTotal_Por_Año_Mes();
            dto.setAnio(Integer.parseInt(columna[0]));
            dto.setMes(Integer.parseInt(columna[1]));
            dto.setRecaudaciontotal(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
