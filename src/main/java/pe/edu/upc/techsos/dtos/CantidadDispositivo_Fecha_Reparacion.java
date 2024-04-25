package pe.edu.upc.techsos.dtos;

import java.time.LocalDate;

public class CantidadDispositivo_Fecha_Reparacion {
    private LocalDate fecha_inicio;
    private int cantidad_dispo;

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getCantidad_dispo() {
        return cantidad_dispo;
    }

    public void setCantidad_dispo(int cantidad_dispo) {
        this.cantidad_dispo = cantidad_dispo;
    }
}
