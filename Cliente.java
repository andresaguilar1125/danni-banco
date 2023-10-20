


import java.util.Date;

public class Cliente {

  public int numeroCliente;
  public String identificacion;
  public String nombre;
  public String apellidos;
  public String direccion;
  public String telefono;
  public String correoElectronico;
  public Date fechaNacimiento;

  public Cliente(
    int numeroCliente,
    String identificacion,
    String nombre,
    String apellidos,
    String direccion,
    String telefono,
    String correoElectronico,
    Date fechaNacimiento
  ) {
    this.numeroCliente = numeroCliente;
    this.identificacion = identificacion;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.direccion = direccion;
    this.telefono = telefono;
    this.correoElectronico = correoElectronico;
    this.fechaNacimiento = fechaNacimiento;
  }

  public int getNumeroCliente() {
    return numeroCliente;
  }
}
