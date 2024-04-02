package pe.edu.upc.techsos.entities;
//HOLA
import jakarta.persistence.*;
@Entity
@Table(name = "Dispositivo")

//Creacion tabla dispositivo
    public class Dispositivo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idDispositivo;
        @Column(name = "Tipo", nullable = false, length = 30)
        private String tipo;
        @Column(name = "Marca", nullable = false, length = 30)
        private String marca;
        @Column(name = "Modelo", nullable = false, length = 50)
        private String modelo;
        @Column(name = "NumSerie", nullable = false)
        private int numserie;

        public Dispositivo() {
        }

    public Dispositivo(int idDispositivo, String tipo, String marca, String modelo, int numserie) {
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

