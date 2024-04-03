package pe.edu.upc.techsos.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.techsos.entities.District;
import pe.edu.upc.techsos.servicesinterfaces.IDistrictService;
import pe.edu.upc.techsos.repositories.IDistrictRepository;
import java.util.List;

    @Service
    public class DistrictServiceImplement implements IDistrictService {
        @Autowired
        private IDistrictRepository mR;
        @Override
        public void insert(District district) {
            mR.save(district);
        }

        @Override
        public List<District> list() {
            return mR.findAll();
        }
    }
