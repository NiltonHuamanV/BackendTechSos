package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.DispositivoDTO;
import pe.edu.upc.techsos.dtos.SumDispositivosTallerEstadoDTO;
import pe.edu.upc.techsos.dtos.SumDispositivosTallerMarcaModeloDTO;
import pe.edu.upc.techsos.entities.Dispositivo;
import pe.edu.upc.techsos.servicesinterfaces.IDispositivoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dispositivo")

public class DispositivoController {
    @Autowired
    private IDispositivoService dS;
    @PostMapping
    @PreAuthorize("hasAuthority('CLIENTE')")
    public void insertar (@RequestBody DispositivoDTO dispositivoDTO)
    {
        ModelMapper d = new ModelMapper();
        Dispositivo dispositivo = d.map (dispositivoDTO, Dispositivo.class);
        dS.insert(dispositivo);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('CLIENTE')")
    public void modificar (@RequestBody DispositivoDTO dispositivoDTO)
    {
        ModelMapper d = new ModelMapper();
        Dispositivo dispositivo = d.map (dispositivoDTO, Dispositivo.class);
        dS.insert(dispositivo);
    }
    @GetMapping
    public List<DispositivoDTO> Listar()
    {
        return dS.list().stream().map(y-> {
            ModelMapper m= new ModelMapper();
            return m.map(y,DispositivoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('CLIENTE')")
    public void eliminar(@PathVariable("id") Integer id)
    {
        dS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public DispositivoDTO listarId(@PathVariable ("id") Integer id)
    {
        ModelMapper d = new ModelMapper();
        DispositivoDTO dto = d.map(dS.listid(id),DispositivoDTO.class);
        return dto;
    }

    @GetMapping("/cantidaddispositivostallerestado")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
    public List<SumDispositivosTallerEstadoDTO> cantidadDispositivosTallerEstado(){
        List<String[]> filaLista = dS.sumDispositivosPorTallerYEstado();
        List<SumDispositivosTallerEstadoDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            SumDispositivosTallerEstadoDTO dto = new SumDispositivosTallerEstadoDTO();
            dto.setNombreTaller(columna[0]);
            dto.setEstado(columna[1]);
            dto.setCantidadDispositivos(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/cantidaddispositivostallermarcamodelo")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
    public List<SumDispositivosTallerMarcaModeloDTO> cantidadDispositivosTallerMarcaModelo(){
        List<String[]> filaLista = dS.sumDispositivosPorTallerMarcaModelo();
        List<SumDispositivosTallerMarcaModeloDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            SumDispositivosTallerMarcaModeloDTO dto = new SumDispositivosTallerMarcaModeloDTO();
            dto.setNombreTaller(columna[0]);
            dto.setNombreMarca(columna[1]);
            dto.setNombreModelo(columna[2]);
            dto.setCantidadDispositivos(Integer.parseInt(columna[3]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

}
