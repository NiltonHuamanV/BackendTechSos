package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Tecnico;

import java.util.List;

@Repository
public interface ITecnicoRepository extends JpaRepository<Tecnico,Integer> {
    @Query(value = "select te.aniosexperiencia,te.nombre,te.apellido,t.idTaller,t.nombre from Taller t join Tecnico te on te.idTecnico=t.tecnico.idTecnico")
    public List<String[]> getAniosExperienciaTecnicos();
}
