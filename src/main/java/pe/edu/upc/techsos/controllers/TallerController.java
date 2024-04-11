package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.TallerDTO;
import pe.edu.upc.techsos.entities.Taller;
import pe.edu.upc.techsos.servicesinterfaces.ITallerService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/taller")

public class TallerController {
    @Autowired
    private ITallerService dS;
    @PostMapping
    public void insertar (@RequestBody TallerDTO tallerDTO)
    {
        ModelMapper d = new ModelMapper();
        Taller taller = d.map (tallerDTO, Taller.class);
        dS.insert(taller);
    }
    @GetMapping()
    public List<TallerDTO> Listar()
    {
        return dS.list().stream().map(y-> {
            ModelMapper m= new ModelMapper();
            return m.map(y,TallerDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public TallerDTO listarId(@PathVariable ("id") Integer id)
    {
        ModelMapper d = new ModelMapper();
        TallerDTO dto = d.map(dS.listid(id),TallerDTO.class);
        return dto;
    }

}
