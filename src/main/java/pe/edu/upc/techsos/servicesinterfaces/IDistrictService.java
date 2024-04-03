package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.District;

import java.util.List;

public interface IDistrictService {
    public void insert(District district);
    public List<District> list();
}
