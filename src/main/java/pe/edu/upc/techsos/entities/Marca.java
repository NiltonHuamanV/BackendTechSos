package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Marca")

//Creacion tabla dispositivo
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmarca;
    @Column(name = "NumSerie", nullable = false)
    private String nombre;

    public Marca() {
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}