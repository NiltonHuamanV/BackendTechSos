package pe.edu.upc.techsos.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "Dispositivo")

//Creacion tabla dispositivo
    public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDispositivo;
    @Column(name = "NumSerie", nullable = false)
    private int numserie;

    public Dispositivo() {
    }

    public Dispositivo(int idDispositivo, int numserie) {
        this.idDispositivo = idDispositivo;
        this.numserie = numserie;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }
}


