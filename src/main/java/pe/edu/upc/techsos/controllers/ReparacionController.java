package pe.edu.upc.techsos.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.CantidadDispositivo_Fecha_Reparacion;
import pe.edu.upc.techsos.dtos.Recaudacion_por_mes_y_anioDTO;
import pe.edu.upc.techsos.dtos.ReparacionDTO;
import pe.edu.upc.techsos.dtos.TallerDTO;
import pe.edu.upc.techsos.entities.Reparacion;
import pe.edu.upc.techsos.entities.Taller;
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
    @PreAuthorize("hasAuthority('TALLER')")
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
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
    public void eliminar(@PathVariable("id") Integer id)
    {
        rS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
    public void modificar (@RequestBody ReparacionDTO reparacionDTO)
    {
        ModelMapper d = new ModelMapper();
        Reparacion reparacion = d.map (reparacionDTO, Reparacion.class);
        rS.insert(reparacion);
    }

    @GetMapping("/cantidad_dispositivo_fecha")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
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
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
    public List<Recaudacion_por_mes_y_anioDTO> recaudacionPorMesYAnioDTOS(@RequestParam int anio, int mes)
    {
        List<String[]> filalista = rS.recaudacionTotalPorMesyAnio(anio,mes);
        List<Recaudacion_por_mes_y_anioDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filalista)
        {
            Recaudacion_por_mes_y_anioDTO dto = new Recaudacion_por_mes_y_anioDTO();
            dto.setAnio(Integer.parseInt(columna[0]));
            dto.setMes(Integer.parseInt(columna[1]));
            dto.setRecaudacion_total(Float.parseFloat(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
