package pe.edu.upc.techsos.dtos;
import pe.edu.upc.techsos.entities.Taller;

import java.time.LocalDate;

public class Comentario_Cliente_TallerDTO {
    private int idComentario_Cliente_Taller;

    private String descripcion;

    private int calificacion;
    private LocalDate fechaComentario;

    private Taller taller;

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

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }
}