package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.TallerDTO;
import pe.edu.upc.techsos.entities.Taller;
import pe.edu.upc.techsos.servicesinterfaces.ITallerService;

import java.util.List;
import java.util.stream.Collectors;
//tabla controller
@RestController
@RequestMapping("/taller")

public class TallerController {
    @Autowired
    private ITallerService dS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('TALLER')")
    public void insertar (@RequestBody TallerDTO tallerDTO)
    {
        ModelMapper d = new ModelMapper();
        Taller taller = d.map (tallerDTO, Taller.class);
        dS.insert(taller);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void modificar (@RequestBody TallerDTO tallerDTO)
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
    @PreAuthorize("hasAuthority('TALLER') or hasAuthority('ADMIN')")
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
    @GetMapping("/listartallerespordistrito")
    public List<TallerDTO> listartalleresdistrito(@RequestParam String distrito)
    {
        return dS.listTalleres(distrito).stream().map(y-> {
            ModelMapper m= new ModelMapper();
            return m.map(y,TallerDTO.class);
        }).collect(Collectors.toList());
    }

}
