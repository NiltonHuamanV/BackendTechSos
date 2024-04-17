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

    @ManyToOne
    @JoinColumn(name = "marcaId")
    private Marca marca;

    public Modelo() {
    }

    public Modelo(int idmodelo, String nombre, Marca marca) {
        this.idmodelo = idmodelo;
        this.nombre = nombre;
        this.marca = marca;
    }

    public int getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(int idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}