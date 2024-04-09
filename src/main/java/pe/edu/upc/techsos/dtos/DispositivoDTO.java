package pe.edu.upc.techsos.dtos;

//Creacion DTO Dispositivo
public class DispositivoDTO {
    private int idDispositivo;

    private int numserie;

    public DispositivoDTO() {
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }
}
