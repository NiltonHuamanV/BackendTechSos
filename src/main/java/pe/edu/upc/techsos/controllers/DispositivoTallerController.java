package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.DispositivoTallerDTO;
import pe.edu.upc.techsos.entities.DispositivoTaller;
import pe.edu.upc.techsos.servicesinterfaces.IDispositivoTallerService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dispositivotaller")
public class DispositivoTallerController {
    @Autowired
    private IDispositivoTallerService dtS;

    @PostMapping
    @PreAuthorize("hasAuthority('CLIENTE')")
    public void insertar (@RequestBody DispositivoTallerDTO dispositivoTallerDTO)
    {
        ModelMapper d = new ModelMapper();
        DispositivoTaller dispositivoTaller = d.map (dispositivoTallerDTO, DispositivoTaller.class);
        dtS.insert(dispositivoTaller);
    }

    @GetMapping
    public List<DispositivoTallerDTO> Listar()
    {
        return dtS.list().stream().map(y-> {
            ModelMapper m= new ModelMapper();
            return m.map(y,DispositivoTallerDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    @PreAuthorize("hasAuthority('CLIENTE')")
    public void modificar (@RequestBody DispositivoTallerDTO dispositivoTallerDTO)
    {
        ModelMapper d = new ModelMapper();
        DispositivoTaller dispositivoTaller = d.map (dispositivoTallerDTO, DispositivoTaller.class);
        dtS.insert(dispositivoTaller);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        dtS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public DispositivoTallerDTO listarId(@PathVariable ("id") Integer id)
    {
        ModelMapper d = new ModelMapper();
        DispositivoTallerDTO dto = d.map(dtS.listid(id),DispositivoTallerDTO.class);
        return dto;
    }
}
