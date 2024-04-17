package pe.edu.upc.techsos.dtos;
import pe.edu.upc.techsos.entities.Cliente;
import pe.edu.upc.techsos.entities.Taller;

import java.time.LocalDate;

public class Comentario_Cliente_TallerDTO {
    private int idComentario_Cliente_Taller;

    private String descripcion;

    private int calificacion;
    private LocalDate fechaComentario;
    private Cliente cliente;

    private Taller taller;

    public Comentario_Cliente_TallerDTO() {
    }

    public Comentario_Cliente_TallerDTO(int idComentario_Cliente_Taller, String descripcion, int calificacion, LocalDate fechaComentario, Cliente cliente, Taller taller) {
        this.idComentario_Cliente_Taller = idComentario_Cliente_Taller;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.fechaComentario = fechaComentario;
        this.cliente = cliente;
        this.taller = taller;
    }

    public int getIdComentario_Cliente_Taller() {
        return idComentario_Cliente_Taller;
    }

    public void setIdComentario_Cliente_Taller(int idComentario_Cliente_Taller) {
        this.idComentario_Cliente_Taller = idComentario_Cliente_Taller;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(LocalDate fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }
}