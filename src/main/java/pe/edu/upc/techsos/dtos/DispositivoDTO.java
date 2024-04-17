package pe.edu.upc.techsos.dtos;

import pe.edu.upc.techsos.entities.Cliente;
import pe.edu.upc.techsos.entities.Modelo;

public class DispositivoDTO {
    private int idDispositivo;

    private String observaciones;
    private Modelo modelo;

    private Cliente cliente;

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
