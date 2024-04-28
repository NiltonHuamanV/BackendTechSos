package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.entities.District;
import pe.edu.upc.techsos.servicesinterfaces.IDistrictService;
import pe.edu.upc.techsos.dtos.DistrictDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/distrito")
public class DistrictController {
    @Autowired
    private IDistrictService ms;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody DistrictDTO districtDTO){
        ModelMapper d= new ModelMapper();
        District district=d.map(districtDTO,District.class);
        ms.insert(district);
    }
    @GetMapping
    public List<DistrictDTO> listar(){
        return ms.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,DistrictDTO.class);

        }).collect(Collectors.toList());
    }
}

