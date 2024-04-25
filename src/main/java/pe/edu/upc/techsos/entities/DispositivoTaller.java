package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DispositivoTaller")
public class DispositivoTaller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDispositivoTaller;
    @ManyToOne
    @JoinColumn(name = "dispositivoId")
    private Dispositivo dispositivo;
    @ManyToOne
    @JoinColumn(name = "tallerId")
    private Taller taller;

    public DispositivoTaller() {
    }

    public DispositivoTaller(int idDispositivoTaller, Dispositivo dispositivo, Taller taller) {
        this.idDispositivoTaller = idDispositivoTaller;
        this.dispositivo = dispositivo;
        this.taller = taller;
    }

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
