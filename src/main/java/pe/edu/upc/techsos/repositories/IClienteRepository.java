package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Cliente;

import java.util.List;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
    public List<Cliente> findByApellidos(String apellidos);

}
