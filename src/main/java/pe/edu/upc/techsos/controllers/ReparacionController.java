package pe.edu.upc.techsos.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.ReparacionDTO;
import pe.edu.upc.techsos.entities.Reparacion;
import pe.edu.upc.techsos.servicesinterfaces.IReparacionService;

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
}
