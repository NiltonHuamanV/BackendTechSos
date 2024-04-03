package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.Cliente;

import java.util.List;

public interface IClienteService
{
    public void  insert(Cliente cliente);
    public List<Cliente> list();

    public void delete (int id );

    public Cliente listId(int id);

    public List<Cliente> findByApellidos(String apellidos);

}
