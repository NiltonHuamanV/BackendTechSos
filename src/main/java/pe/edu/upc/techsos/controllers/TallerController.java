package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.PosibleGananciaTotal;
import pe.edu.upc.techsos.dtos.TallerDTO;
import pe.edu.upc.techsos.entities.Taller;
import pe.edu.upc.techsos.servicesinterfaces.ITallerService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//tabla controller
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
    @PutMapping
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
    @GetMapping("/posibleganancia/{id}")
    public PosibleGananciaTotal getPosibleGanancia(@PathVariable("id") int tallerId){
        String[] res=dS.getPosibleGananciaPorTaller(tallerId).get(0);
        PosibleGananciaTotal p = new PosibleGananciaTotal();
        p.setTotal(Double.parseDouble(res[0]));
        return p;
    }
    @GetMapping("/tallerespordistrito/{distrito_id}")
    public List<TallerDTO> getTalleresPorDistrito(@PathVariable("distrito_id") int distritoId){
        List<TallerDTO> tallerDTOS=new ArrayList<>();
        List<Taller> tallers = dS.getTalleresPorDistrito(distritoId);
        for(Taller t: tallers){
            ModelMapper m = new ModelMapper();
            TallerDTO tallerDTO = m.map(t,TallerDTO.class);
            tallerDTOS.add(tallerDTO);
        }
        return tallerDTOS;
    }
    @GetMapping("/tallermejocalificacion")
    public List<TallerDTO> getTalleresMejorCalificacion(){
        List<TallerDTO> dtoLista = new ArrayList<>();
        for(Taller taller:dS.getTalleresConMejorCalificacion()){
            ModelMapper m = new ModelMapper();
            TallerDTO tallerDTO = m.map(taller,TallerDTO.class);
            dtoLista.add(tallerDTO);
        }
        return dtoLista;
    }
}
