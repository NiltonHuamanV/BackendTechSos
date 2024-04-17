package pe.edu.upc.techsos.dtos;

import pe.edu.upc.techsos.entities.Marca;

public class ModeloDTO {
    private int idmodelo;

    private String nombre;
    private Marca marca;

    public int getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(int idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}