package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.*;
import pe.edu.upc.techsos.entities.Comentario_Cliente_Taller;
import pe.edu.upc.techsos.entities.Dispositivo;
import pe.edu.upc.techsos.servicesinterfaces.IComentario_Cliente_TallerService;
import pe.edu.upc.techsos.servicesinterfaces.IDispositivoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")

public class Comentario_Cliente_TallerController {
    @Autowired
    private IComentario_Cliente_TallerService cS;
    @PostMapping
    @PreAuthorize("hasAuthority('CLIENTE') or hasAuthority('ADMIN')")
    public void insertar (@RequestBody Comentario_Cliente_TallerDTO comentarioClienteTallerDTO)
    {
        ModelMapper d = new ModelMapper();
        Comentario_Cliente_Taller comentarioClienteTaller = d.map (comentarioClienteTallerDTO, Comentario_Cliente_Taller.class);
        cS.insert(comentarioClienteTaller);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('CLIENTE')")
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
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('CLIENTE')")
    public void eliminar(@PathVariable("id") Integer id)
    {
        cS.delete(id);
    }

    @GetMapping("/mejoresTalleres")
    public List<MejoresTalleresDTO> ListarMejoresTalleres() {
        List<String[]> filaLista = cS.ListarMejoresTalleres();
        List<MejoresTalleresDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            MejoresTalleresDTO dto=new MejoresTalleresDTO();
            dto.setIdTaller(Integer.parseInt(columna[0]));
            dto.setNombre_taller(columna[1]);
            dto.setTelefono(columna[2]);
            dto.setDireccion(columna[3]);
            dto.setPromediocalificacion(Double.parseDouble(columna[4]));
            dtoLista.add(dto);
        }
        return  dtoLista;
    }


    @GetMapping("/promedioTalleres")
    public List<PromedioTalleresDTO> ListarPromedioTalleres() {
        List<String[]> filaLista = cS.PromedioTalleres();
        List<PromedioTalleresDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            PromedioTalleresDTO dto=new PromedioTalleresDTO();
            dto.setIdTaller(Integer.parseInt(columna[0]));
            dto.setNombre_taller(columna[1]);
            dto.setPromediocalificacion(Double.parseDouble(columna[2]));
            dtoLista.add(dto);
        }
        return  dtoLista;
    }


    @GetMapping("/top5Talleres")
    public List<Top5TalleresDTO> ListarTop5Talleres() {
        List<String[]> filaLista = cS.Top5Talleres();
        List<Top5TalleresDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            Top5TalleresDTO dto=new Top5TalleresDTO();
            dto.setIdTaller(Integer.parseInt(columna[0]));
            dto.setNombre_taller(columna[1]);
            dto.setPromediocalificacion(Double.parseDouble(columna[2]));
            dtoLista.add(dto);
        }
        return  dtoLista;
    }



}