package pe.edu.upc.techsos.dtos;

import java.time.LocalDate;

public class RecaudacionTotal_Por_Año_Mes {
    private int anio;
    private int mes;
    private int recaudaciontotal;

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getRecaudaciontotal() {
        return recaudaciontotal;
    }

    public void setRecaudaciontotal(int recaudaciontotal) {
        this.recaudaciontotal = recaudaciontotal;
    }
}
