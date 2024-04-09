package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.MarcaDTO;

import pe.edu.upc.techsos.dtos.ModeloDTO;
import pe.edu.upc.techsos.entities.Modelo;
import pe.edu.upc.techsos.servicesinterfaces.IModeloService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Modelo")
public class ModeloController {
    @Autowired
    private IModeloService dS;
    @PostMapping
    public void insertar (@RequestBody ModeloDTO modeloDTO)
    {
        ModelMapper d = new ModelMapper();
        Modelo modelo = d.map (modeloDTO, Modelo.class);
        dS.insert(modelo);
    }
    @GetMapping
    public List<ModeloDTO> Listar()
    {
        return dS.list().stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y,ModeloDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        dS.delete(id);
    }
    @GetMapping("/{id}")
    public ModeloDTO listarId(@PathVariable ("id") Integer id)
    {
        ModelMapper d = new ModelMapper();
        ModeloDTO dto = d.map(dS.listid(id),ModeloDTO.class);
        return dto;
    }

}
