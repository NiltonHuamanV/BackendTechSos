package pe.edu.upc.techsos.dtos;

public class Recaudacion_por_mes_y_anioDTO {
    private int anio;
    private int mes;
    private float recaudacion_total;

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

    public float getRecaudacion_total() {
        return recaudacion_total;
    }

    public void setRecaudacion_total(float recaudacion_total) {
        this.recaudacion_total = recaudacion_total;
    }
}
