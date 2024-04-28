package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.Comentario_Cliente_Taller;

import java.util.List;

public interface IComentario_Cliente_TallerService {
    public void  insert(Comentario_Cliente_Taller comentarioClienteTaller);
    public List<Comentario_Cliente_Taller> list();

    public void delete (int id);

    public List<String[]>ListarMejoresTalleres();

    public List<String[]>PromedioTalleres();

    public List<String[]>Top5Talleres();


}
