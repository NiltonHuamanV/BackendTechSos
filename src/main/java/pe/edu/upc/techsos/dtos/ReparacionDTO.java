package pe.edu.upc.techsos.dtos;

import java.util.Date;

public class ReparacionDTO {

        private int idReparacion;

        private Date FechaInicio;

        private Date FechaFin;

        private String Problema;

        private String Estado;

        private float Costo;

        public int getIdReparacion() {
            return idReparacion;
        }

        public void setIdReparacion(int idReparacion) {
            this.idReparacion = idReparacion;
        }

        public Date getFechaInicio() {
            return FechaInicio;
        }

        public void setFechaInicio(Date fechaInicio) {
            this.FechaInicio = fechaInicio;
        }

        public Date getFechaFin() {
            return FechaFin;
        }

        public void setFechaFin(Date fechaFin) {
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

}

