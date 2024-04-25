package pe.edu.upc.techsos.dtos;


public class TecnicoDTO {
    private int IdTecnico;

    private String nombre;

    private String apellido;

    private int edad;

    private int aniosexperiencia;


    public int getIdtecnico() {
        return IdTecnico;
    }

    public void setIdtecnico(int idtecnico) {
        this.IdTecnico = idtecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAniosexp() {
        return aniosexperiencia;
    }

    public void setAniosexp(int aniosexp) {
        this.aniosexperiencia = aniosexp;
    }
}
