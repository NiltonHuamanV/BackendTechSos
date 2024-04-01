package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.DispositivoDTO;
import pe.edu.upc.techsos.entities.Dispositivo;
import pe.edu.upc.techsos.servicesinterfaces.IDispositivoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Dispositivos")

public class DispositivoController {
    @Autowired
    private IDispositivoService dS;
    @PostMapping
    public void insertar (@RequestBody DispositivoDTO dispositivoDTO)
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


}
