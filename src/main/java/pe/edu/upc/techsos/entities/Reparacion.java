package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Reparacion")


public class Reparacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReparacion;
    @Column(name ="Fecha Inicio",nullable = false)
    private Date FechaInicio;
    @Column(name ="Fecha Fin",nullable = false)
    private Date FechaFin;
    @Column(name = "Problema", nullable = false, length = 100)
    private String Problema;
    @Column(name = "Estadp", nullable = false, length = 30)
    private String Estado;
    @Column(name ="Costo",nullable = false)
    private float Costo;

    public Reparacion(){}

    public Reparacion(int idReparacion, Date FechaInicio, Date FechaFin, String Problema, String Estado, float Costo){
        this.idReparacion=idReparacion;
        this.FechaInicio=FechaInicio;
        this.FechaFin=FechaFin;
        this.Problema=Problema;
        this.Estado=Estado;
        this.Costo=Costo;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.FechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.FechaFin = fechaFin;
    }

    public String getProblema() {
        return Problema;
    }

    public void setProblema(String problema) {
        this.Problema = problema;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float costo) {
        this.Costo = costo;
    }

}
