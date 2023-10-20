


import java.util.Date;

public class Cuenta {

  public int numeroCliente;
  public String identificacion;
  public String nombre;
  public String apellidos;
  public String direccion;
  public String telefono;
  public String correoElectronico;
  public Date fechaNacimiento;

  public Cuenta(
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

//   Cuenta(Cliente cliente, double saldoInicial) {
//     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//   }

//   int getNumero() {
//     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//   }

//   String getSaldo() {
//     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//   }

//   void depositar(double monto) {
//     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//   }

//   boolean retirar(double monto) {
//     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//   }
}
