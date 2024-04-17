package pe.edu.upc.techsos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(name = "nombres",nullable = false,length =50)
    private String nombres;
    @Column(name = "apellidos",nullable = false,length =50)
    private String apellidos;
    @Column(name = "email",nullable = false,length =50)
    private String email;
    @Column(name = "telefono",nullable = false,length =9)
    private String telefono;
    @Column(name = "direccion",nullable = false,length =300)
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "districtId")
    private District district;

    public Cliente() {  }

    public Cliente(int idCliente, String nombres, String apellidos, String email, String telefono, String direccion, District district)
    {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.district = district;
    }

    public int getIdCliente() { return idCliente;   }
    public void setIdCliente(int idCliente) {   this.idCliente = idCliente; }


    public String getNombres() {    return nombres; }
    public void setNombres(String nombres) {     this.nombres = nombres;    }


    public String getApellidos() {  return apellidos;   }
    public void setApellidos(String apellidos) {    this.apellidos = apellidos; }


    public String getEmail() {  return email;   }
    public void setEmail(String email) {    this.email = email; }


    public String getTelefono() {   return telefono;    }
    public void setTelefono(String telefono) {  this.telefono = telefono;   }


    public String getDireccion() {  return direccion;   }
    public void setDireccion(String direccion) {    this.direccion = direccion; }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

}
