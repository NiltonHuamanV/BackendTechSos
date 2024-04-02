package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.DeliveryDTO;
import pe.edu.upc.techsos.entities.Delivery;
import pe.edu.upc.techsos.servicesinterfaces.IDeliveryService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
    @Autowired
    private IDeliveryService dS;

    @PostMapping
    public void insertar(@RequestBody DeliveryDTO deliveryDTO){
        ModelMapper d = new ModelMapper();
        Delivery delivery = d.map(deliveryDTO, Delivery.class);
        dS.insert(delivery);
    }
    @GetMapping
    public List<DeliveryDTO> listar(){
        return dS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, DeliveryDTO.class);
        }).collect(Collectors.toList());
    }
}
