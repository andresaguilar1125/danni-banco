import java.util.Date;

public class Transaccion {
    // Estan privados porque esa es la ideologia de la encapsulacion de objetos en lenguajes orientados a objectos (OOP)
  // Java es OOP por lo que nunca deberia accesarse los atributos directamente de otras clases si estan definido su set y get
  // Esto puede dar pie a que otro cliente accese mi cuenta con codigo malicioso y otras practicas de codigo no deseadas
  private int numeroTransaccion;
  private String tipo;
  private int numeroCuenta;
  private double saldoActual;
  private double monto;
  private Date fecha;

  public Transaccion(
    int numeroTransaccion,
    String tipo,
    int numeroCuenta,
    double saldoActual,
    double monto,
    Date fecha
  ) {
    this.numeroTransaccion = numeroTransaccion;
    this.tipo = tipo;
    this.numeroCuenta = numeroCuenta;
    this.saldoActual = saldoActual;
    this.monto = monto;
    this.fecha = fecha;
  }

  /*
  Se encapsularon todos los atributos con su get y set correspondiente
  */
  public int getNumeroTransaccion() {
    return numeroTransaccion;
  }

  public void setNumeroTransaccion(int numeroTransaccion) {
    this.numeroTransaccion = numeroTransaccion;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public double getSaldoActual() {
    return saldoActual;
  }

  public void setSaldoActual(double saldoActual) {
    this.saldoActual = saldoActual;
  }

  public double getMonto() {
    return monto;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }
  // You can add other methods and logic as needed.
}
