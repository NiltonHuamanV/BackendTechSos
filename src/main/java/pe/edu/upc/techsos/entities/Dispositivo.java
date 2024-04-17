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
    @ManyToOne
    @JoinColumn(name = "modeloId")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente cliente;

    public Dispositivo() {
    }

    public Dispositivo(int idDispositivo, String observaciones, Modelo modelo, Cliente cliente) {
        this.idDispositivo = idDispositivo;
        this.observaciones = observaciones;
        this.modelo = modelo;
        this.cliente = cliente;
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
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}


