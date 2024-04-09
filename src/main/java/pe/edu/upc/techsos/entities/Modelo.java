package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Modelo")

public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmodelo;
    @Column(name = "Nombre", nullable = false)
    private String nombre;

    public Modelo() {
    }

    public int getIdmarca() {
        return idmodelo;
    }

    public void setIdmarca(int idmarca) {
        this.idmodelo = idmodelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}