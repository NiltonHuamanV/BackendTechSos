package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Comentario_Cliente_Taller;
import pe.edu.upc.techsos.repositories.IComentario_Cliente_TallerRepository;
import pe.edu.upc.techsos.servicesinterfaces.IComentario_Cliente_TallerService;

import java.util.List;
@Service
public class Comentario_Cliente_TallerImplement implements IComentario_Cliente_TallerService
{
    @Autowired
    private IComentario_Cliente_TallerRepository cR;
    @Override
    public void insert(Comentario_Cliente_Taller comentarioClienteTaller) {cR.save(comentarioClienteTaller);}
    @Override
    public List<Comentario_Cliente_Taller> list() { return cR.findAll();}
    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public List<String[]> ListarMejoresTalleres() { return cR.ListarMejoresTalleres();  }

    @Override
    public List<String[]> PromedioTalleres() { return cR.PromedioTalleres();    }

    @Override
    public List<String[]> Top5Talleres() { return cR.Top5Talleres();    }

}
