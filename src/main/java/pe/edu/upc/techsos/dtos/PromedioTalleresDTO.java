package pe.edu.upc.techsos.dtos;

public class PromedioTalleresDTO {
    private int idTaller;
    private String nombre_taller;
    private double promediocalificacion;

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    public String getNombre_taller() {
        return nombre_taller;
    }

    public void setNombre_taller(String nombre_taller) {
        this.nombre_taller = nombre_taller;
    }

    public double getPromediocalificacion() {
        return promediocalificacion;
    }

    public void setPromediocalificacion(double promediocalificacion) {
        this.promediocalificacion = promediocalificacion;
    }
}
