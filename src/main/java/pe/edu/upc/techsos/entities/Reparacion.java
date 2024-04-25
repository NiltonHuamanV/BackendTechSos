package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Reparacion")


public class Reparacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReparacion;
    @Column(name ="FechaInicio",nullable = false)
    private LocalDate FechaInicio;
    @Column(name ="FechaFin",nullable = false)
    private LocalDate FechaFin;
    @Column(name = "Problema", nullable = false, length = 100)
    private String Problema;
    @Column(name = "Estado", nullable = false, length = 30)
    private String Estado;
    @Column(name ="Costo",nullable = false)
    private float Costo;

    @ManyToOne
    @JoinColumn(name = "dispositivo_taller_id")
    private DispositivoTaller dispositivoTaller;

    public Reparacion(){}

    public Reparacion(int idReparacion, LocalDate FechaInicio, LocalDate FechaFin, String Problema, String Estado, float Costo, DispositivoTaller dispositivoTaller){
        this.idReparacion=idReparacion;
        this.FechaInicio=FechaInicio;
        this.FechaFin=FechaFin;
        this.Problema=Problema;
        this.Estado=Estado;
        this.Costo=Costo;
        this.dispositivoTaller = dispositivoTaller;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
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

    public DispositivoTaller getDispositivoTaller() {
        return dispositivoTaller;
    }

    public void setDispositivoTaller(DispositivoTaller dispositivoTaller) {
        this.dispositivoTaller = dispositivoTaller;
    }
}
