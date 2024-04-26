package pe.edu.upc.techsos.dtos;

import pe.edu.upc.techsos.entities.District;
import pe.edu.upc.techsos.entities.Tecnico;

public class MejoresTalleresDTO
{
    private int idTaller;
    private String nombre_taller;
    private String telefono;
    private String direccion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPromediocalificacion() {
        return promediocalificacion;
    }

    public void setPromediocalificacion(double promediocalificacion) {
        this.promediocalificacion = promediocalificacion;
    }
}
