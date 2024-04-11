package pe.edu.upc.techsos.dtos;

public class ClienteDTO
{
    private int idCliente;
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;
    private String direccion;

    public int getIdCliente() { return idCliente;   }
    public void setIdCliente(int idCliente) {   this.idCliente = idCliente; }

    public String getNombres() {    return nombres; }
    public void setNombres(String nombres) {    this.nombres = nombres; }

    public String getApellidos() {  return apellidos;   }
    public void setApellidos(String apellidos) {    this.apellidos = apellidos; }

    public String getEmail() {  return email;   }
    public void setEmail(String email) {    this.email = email; }

    public String getTelefono() {   return telefono;    }
    public void setTelefono(String telefono) {  this.telefono = telefono;   }

    public String getDireccion() {  return direccion;   }
    public void setDireccion(String direccion) {    this.direccion = direccion; }
}
