package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Users;
import pe.edu.upc.techsos.repositories.IUserRepository;
import pe.edu.upc.techsos.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(Users usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Users listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Users());
    }
}
