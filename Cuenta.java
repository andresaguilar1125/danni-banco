import java.util.Date;

public class Cliente {
    // Estan privados porque esa es la ideologia de la encapsulacion de objetos en lenguajes orientados a objectos (OOP)
  // Java es OOP por lo que nunca deberia accesarse los atributos directamente de otras clases si estan definido su set y get
  // Esto puede dar pie a que otro cliente accese mi cuenta con codigo malicioso y otras practicas de codigo no deseadas
    private int numeroCliente;
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private Date fechaNacimiento;

    public Cliente(int numeroCliente, String identificacion, String nombre, String apellidos, String direccion, String telefono, String correoElectronico, Date fechaNacimiento) {
        this.numeroCliente = numeroCliente;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
    }

  /*
  Se encapsularon todos los atributos con su get y set correspondiente
  */

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // You can add other methods and logic as needed.
}
