package pe.edu.upc.techsos.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TecnicoExperienciaTaller {
    private int aniosExperiencia;
    private String nombre;
    private String apellido;
    private Long tallerId;
    private String tallerNombre;
}
