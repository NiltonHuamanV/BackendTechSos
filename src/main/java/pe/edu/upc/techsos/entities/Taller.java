package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Taller")
public class Taller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTaller;
    @Column(name = "NombreTaller", nullable = false)
    private String nombre;

    @Column(name = "Telefono", nullable = false, length = 9)
    private String numerodetelefono;
    @Column(name = "Direccion", nullable = false, length = 100)
    private String direccion;



    @ManyToOne
    @JoinColumn(name = "districtId")
    private District district;
    @OneToOne
    @JoinColumn(name = "tecnicoId")
    private Tecnico tecnico;

    public Taller(int idTaller, String nombre, String numerodetelefono, String direccion, District district, Tecnico tecnico) {
        this.idTaller = idTaller;
        this.nombre = nombre;
        this.numerodetelefono = numerodetelefono;
        this.direccion = direccion;
        this.district = district;
        this.tecnico = tecnico;
    }

    public Taller() {

    }

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumerodetelefono() {
        return numerodetelefono;
    }

    public void setNumerodetelefono(String numerodetelefono) {
        this.numerodetelefono = numerodetelefono;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}

