package pe.edu.upc.techsos.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.techsos.dtos.ClienteDTO;
import pe.edu.upc.techsos.entities.Cliente;
import pe.edu.upc.techsos.servicesinterfaces.IClienteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cliente")
public class ClientController
{
    @Autowired
    private IClienteService cS;

    @PostMapping
    public void insertar(@RequestBody ClienteDTO clienteDTO)
    {
        ModelMapper d = new ModelMapper();
        Cliente cliente = d.map(clienteDTO, Cliente.class);
        cS.insert(cliente);
    }

    @GetMapping
    public List<ClienteDTO> listar()
    {
        return cS.list().stream().map(y-> {
            ModelMapper m=new ModelMapper();
            return  m.map(y,ClienteDTO.class);
        }).collect(Collectors.toList());
    }


    @DeleteMapping("/{id}")
    public void eliminar    (@PathVariable("id") Integer id)    {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ClienteDTO listarId    (@PathVariable("id") Integer id){
        ModelMapper m =new ModelMapper();
        ClienteDTO dto=m.map(cS.listId(id), ClienteDTO.class);
        return dto;
    }

    @GetMapping("/find")
    public List<ClienteDTO> buscarCliente(@RequestParam String apellidos) {
        return cS.findByApellidos(apellidos).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ClienteDTO.class);
        }).collect(Collectors.toList());

    }

}
