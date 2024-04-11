package pe.edu.upc.techsos.dtos;


public class TallerDTO {

    private int idTaller;
    private String nombre;

    private String numerodetelefono;

    public TallerDTO(int idTaller, String nombre) {
        this.idTaller = idTaller;
        this.nombre = nombre;
    }

    public TallerDTO() {

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
}
