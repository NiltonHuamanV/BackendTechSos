package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.TecnicoDTO;
import pe.edu.upc.techsos.entities.Tecnico;
import pe.edu.upc.techsos.servicesinterfaces.ITecnicoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tecnico")

public class TecnicoController {
    @Autowired
    private ITecnicoService dS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
    public void insertar (@RequestBody TecnicoDTO tecnicoDTO)
    {
        ModelMapper d = new ModelMapper();
        Tecnico tecnico = d.map (tecnicoDTO, Tecnico.class);
        dS.insert(tecnico);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
    public void modificar (@RequestBody TecnicoDTO tecnicoDTO)
    {
        ModelMapper d = new ModelMapper();
        Tecnico tecnico = d.map (tecnicoDTO, Tecnico.class);
        dS.insert(tecnico);
    }
    @GetMapping()
    public List<TecnicoDTO> Listar()
    {
        return dS.list().stream().map(y-> {
            ModelMapper m= new ModelMapper();
            return m.map(y,TecnicoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
    public void eliminar(@PathVariable("id") Integer id)
    {
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public TecnicoDTO listarId(@PathVariable ("id") Integer id)
    {
        ModelMapper d = new ModelMapper();
        TecnicoDTO dto = d.map(dS.listid(id),TecnicoDTO.class);
        return dto;
    }

}