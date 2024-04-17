package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.Comentario_Cliente_TallerDTO;
import pe.edu.upc.techsos.dtos.DispositivoDTO;
import pe.edu.upc.techsos.entities.Comentario_Cliente_Taller;
import pe.edu.upc.techsos.entities.Dispositivo;
import pe.edu.upc.techsos.servicesinterfaces.IComentario_Cliente_TallerService;
import pe.edu.upc.techsos.servicesinterfaces.IDispositivoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")

public class Comentario_Cliente_TallerController {
    @Autowired
    private IComentario_Cliente_TallerService cS;
    @PostMapping
    public void insertar (@RequestBody Comentario_Cliente_TallerDTO comentarioClienteTallerDTO)
    {
        ModelMapper d = new ModelMapper();
        Comentario_Cliente_Taller comentarioClienteTaller = d.map (comentarioClienteTallerDTO, Comentario_Cliente_Taller.class);
        cS.insert(comentarioClienteTaller);
    }
    @PutMapping
    public void modificar (@RequestBody Comentario_Cliente_TallerDTO comentarioClienteTallerDTO)
    {
        ModelMapper d = new ModelMapper();
        Comentario_Cliente_Taller comentarioClienteTaller = d.map (comentarioClienteTallerDTO, Comentario_Cliente_Taller.class);
        cS.insert(comentarioClienteTaller);
    }
    @GetMapping
    public List<Comentario_Cliente_TallerDTO> Listar()
    {
        return cS.list().stream().map(y-> {
            ModelMapper m= new ModelMapper();
            return m.map(y,Comentario_Cliente_TallerDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        cS.delete(id);
    }
}