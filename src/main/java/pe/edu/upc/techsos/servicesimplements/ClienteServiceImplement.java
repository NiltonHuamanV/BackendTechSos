package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Cliente;
import pe.edu.upc.techsos.repositories.IClienteRepository;
import pe.edu.upc.techsos.servicesinterfaces.IClienteService;

import java.util.List;

@Service
public class ClienteServiceImplement implements IClienteService
{
    @Autowired
    private IClienteRepository cR;

    @Override
    public void insert(Cliente cliente) {
        cR.save(cliente);
    }

    @Override
    public List<Cliente> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {    cR.deleteById(id);  }

    @Override
    public Cliente listId(int id) { return cR.findById(id).orElse(new Cliente());   }

    @Override
    public List<Cliente> findByApellidos(String apellidos) {   return cR.findByApellidos(apellidos); }


}
