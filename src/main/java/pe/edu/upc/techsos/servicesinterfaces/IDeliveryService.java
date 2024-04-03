package pe.edu.upc.techsos.servicesinterfaces;

import pe.edu.upc.techsos.entities.Delivery;

import java.util.List;

public interface IDeliveryService {
    public void insert(Delivery delivery);
    public List<Delivery> list();
    public void delete(int id);
    public Delivery listId(int id);
}
