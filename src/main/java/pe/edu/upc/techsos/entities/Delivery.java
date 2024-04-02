package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDelivery;
    @Column(name = "nombreEmpresa", nullable = false, length = 25)
    private String nombreEmpresa;
    @Column(name = "nombreRepartidor", nullable = false, length = 25)
    private String nombreRepartidor;
    @Column(name = "telefonoRepartidor", nullable = false, length = 9)
    private String telefonoRepartidor;

    public Delivery() {
    }

    public Delivery(int idDelivery, String nombreEmpresa, String nombreRepartidor, String telefonoRepartidor) {
        this.idDelivery = idDelivery;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreRepartidor = nombreRepartidor;
        this.telefonoRepartidor = telefonoRepartidor;
    }

    public int getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(int idDelivery) {
        this.idDelivery = idDelivery;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }

    public String getTelefonoRepartidor() {
        return telefonoRepartidor;
    }

    public void setTelefonoRepartidor(String telefonoRepartidor) {
        this.telefonoRepartidor = telefonoRepartidor;
    }
}
