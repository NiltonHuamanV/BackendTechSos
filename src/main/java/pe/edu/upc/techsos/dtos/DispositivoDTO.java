package pe.edu.upc.techsos.dtos;


public class DispositivoDTO {
    private int idDispositivo;
    private String tipo;
    private String marca;

    private String modelo;

    private int numserie;

    public DispositivoDTO() {
    }

    public DispositivoDTO(int idDispositivo, String tipo, String marca, String modelo, int numserie) {
        this.idDispositivo = idDispositivo;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.numserie = numserie;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }
}
