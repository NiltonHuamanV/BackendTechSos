package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.MarcaDTO;
import pe.edu.upc.techsos.entities.Marca;
import pe.edu.upc.techsos.servicesinterfaces.IMarcaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/marca")
public class MarcaController {
    @Autowired
    private IMarcaService dS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar (@RequestBody MarcaDTO marcaDTO)
    {
        ModelMapper d = new ModelMapper();
        Marca marca = d.map (marcaDTO, Marca.class);
        dS.insert(marca);
    }
    @GetMapping
    public List<MarcaDTO> Listar()
    {
        return dS.list().stream().map(y-> {
            ModelMapper m= new ModelMapper();
            return m.map(y,MarcaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id)
    {
        dS.delete(id);
    }
    @GetMapping("/{id}")
    public MarcaDTO listarId(@PathVariable ("id") Integer id)
    {
        ModelMapper d = new ModelMapper();
        MarcaDTO dto = d.map(dS.listid(id),MarcaDTO.class);
        return dto;
    }

}
