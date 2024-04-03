package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "District")

public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrict;
    @Column(name = "name", nullable = false,length = 100)
    private String name;

    public District(int idDistrict, String name) {
        this.idDistrict = idDistrict;
        this.name = name;
    }

    public District() {

    }

    public int getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
