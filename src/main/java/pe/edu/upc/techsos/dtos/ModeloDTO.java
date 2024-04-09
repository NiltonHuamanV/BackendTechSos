package pe.edu.upc.techsos.dtos;

public class ModeloDTO {
    private int idmodelo;

    private String nombre;

    public int getIdmarca() {
        return idmodelo;
    }

    public void setIdmarca(int idmarca) {
        this.idmodelo = idmodelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}