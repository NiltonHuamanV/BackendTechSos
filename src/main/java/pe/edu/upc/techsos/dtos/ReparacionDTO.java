package pe.edu.upc.techsos.dtos;

import pe.edu.upc.techsos.entities.DispositivoTaller;

import java.time.LocalDate;
import java.util.Date;

public class ReparacionDTO {

        private int idReparacion;

        private LocalDate FechaInicio;

        private LocalDate FechaFin;

        private String Problema;

        private String Estado;

        private float Costo;

        private DispositivoTaller dispositivoTaller;

        public int getIdReparacion() {
            return idReparacion;
        }

        public void setIdReparacion(int idReparacion) {
            this.idReparacion = idReparacion;
        }

        public LocalDate getFechaInicio() {
            return FechaInicio;
        }

        public void setFechaInicio(LocalDate fechaInicio) {
            this.FechaInicio = fechaInicio;
        }

        public LocalDate getFechaFin() {
            return FechaFin;
        }

        public void setFechaFin(LocalDate fechaFin) {
            this.FechaFin = fechaFin;
        }

        public String getProblema() {
            return Problema;
        }

        public void setProblema(String problema) {
            this.Problema = problema;
        }

        public String getEstado() {
            return Estado;
        }

        public void setEstado(String estado) {
            this.Estado = estado;
        }

        public float getCosto() {
            return Costo;
        }

        public void setCosto(float costo) {
            this.Costo = costo;
        }

        public DispositivoTaller getDispositivoTaller() {
            return dispositivoTaller;
        }

        public void setDispositivoTaller(DispositivoTaller dispositivoTaller) {
            this.dispositivoTaller = dispositivoTaller;
        }
}

