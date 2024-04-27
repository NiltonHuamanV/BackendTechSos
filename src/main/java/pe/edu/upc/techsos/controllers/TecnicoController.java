package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.TecnicoDTO;
import pe.edu.upc.techsos.entities.Tecnico;
import pe.edu.upc.techsos.servicesinterfaces.ITecnicoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tecnico")

public class TecnicoController {
    @Autowired
    private ITecnicoService dS;
    @PostMapping
    public void insertar (@RequestBody TecnicoDTO tecnicoDTO)
    {
        ModelMapper d = new ModelMapper();
        Tecnico tecnico = d.map (tecnicoDTO, Tecnico.class);
        dS.insert(tecnico);
    }
    @PutMapping
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

    @GetMapping("/{tallerId}")
    public List<TecnicoDTO> ListByTaller(int tallerId) {
        ModelMapper d = new ModelMapper();
        List<Tecnico> tecnicos = dS.findByTaller(tallerId);
        List<TecnicoDTO> tecnicoDTOS = new ArrayList<>();
        for(Tecnico tecnico : tecnicos) {
            tecnicoDTOS.add(d.map(tecnico, TecnicoDTO.class));
        }
        return tecnicoDTOS;
    }

}