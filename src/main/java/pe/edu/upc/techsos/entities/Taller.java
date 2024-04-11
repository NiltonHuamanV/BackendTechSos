package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Taller")
public class Taller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTaller;
    @Column(name = "NombreTaller", nullable = false)
    private String nombre;

    @Column(name="Telefono", nullable = false, length = 9)
    private String numerodetelefono;

    public Taller(int idTaller, String name) {
        this.idTaller = idTaller;
        this.nombre = nombre;
    }

    public Taller() {

    }

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumerodetelefono() {
        return numerodetelefono;
    }

    public void setNumerodetelefono(String numerodetelefono) {
        this.numerodetelefono = numerodetelefono;
    }
}

