package pe.edu.upc.techsos.dtos;

import pe.edu.upc.techsos.entities.Dispositivo;
import pe.edu.upc.techsos.entities.Taller;

public class DispositivoTallerDTO {
    private int idDispositivoTaller;
    private Dispositivo dispositivo;
    private Taller taller;

    public int getIdDispositivoTaller() {
        return idDispositivoTaller;
    }

    public void setIdDispositivoTaller(int idDispositivoTaller) {
        this.idDispositivoTaller = idDispositivoTaller;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }
}
