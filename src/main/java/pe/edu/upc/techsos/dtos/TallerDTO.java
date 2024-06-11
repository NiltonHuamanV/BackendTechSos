package pe.edu.upc.techsos.dtos;


import pe.edu.upc.techsos.entities.District;

public class TallerDTO {

    private int idTaller;
    private String nombre;

    private String numerodetelefono;
    private String direccion;
    private District district;

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

}
