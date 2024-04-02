package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.Delivery;
import pe.edu.upc.techsos.repositories.IDeliveryRepository;
import pe.edu.upc.techsos.servicesinterfaces.IDeliveryService;

import java.util.List;

@Service
public class DeliveryServiceImplements implements IDeliveryService {
    @Autowired
    private IDeliveryRepository dR;

    @Override
    public void insert(Delivery delivery) {
        dR.save(delivery);
    }

    @Override
    public List<Delivery> list() {
        return dR.findAll();
    }
}
