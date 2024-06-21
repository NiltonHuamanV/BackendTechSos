package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.District;

import java.util.List;

public interface IDistrictService {
    public void insert(District district);
    void delete(int id);
    public List<District> list();
}
