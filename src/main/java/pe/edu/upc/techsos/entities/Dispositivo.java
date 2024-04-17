package pe.edu.upc.techsos.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "Dispositivo")

//Creacion tabla dispositivo
    public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDispositivo;
    @Column(name = "Observaciones", nullable = false)
    private String observaciones;


    public Dispositivo() {
    }

    public Dispositivo(int idDispositivo, String observaciones) {
        this.idDispositivo = idDispositivo;
        this.observaciones = observaciones;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


}


