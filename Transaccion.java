


import java.util.Date;

public class Transaccion {

  public int numeroTransaccion;
  public String tipo;
  public int numeroCuenta;
  public double saldoActual;
  public double monto;
  public Date fecha;

  public Transaccion(
    String tipo,
    int numeroCuenta,
    double saldoActual,
    double monto
  ) {
    int nextNumeroTransaccion = 0;
    this.numeroTransaccion = nextNumeroTransaccion++;
    this.tipo = tipo;
    this.numeroCuenta = numeroCuenta;
    this.saldoActual = saldoActual;
    this.monto = monto;
    this.fecha = new Date();
  }

  public int getNumeroTransaccion() {
    return numeroTransaccion;
  }

  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  /**
   *
   * @return
   */
  @Override
  public String toString() {
    return (
      "Número de Transacción: " +
      numeroTransaccion +
      "\nTipo: " +
      tipo +
      "\nFecha: " +
      fecha +
      "\nNúmero de Cuenta: " +
      numeroCuenta +
      "\nSaldo Actual: " +
      saldoActual +
      "\nMonto: " +
      monto +
      "\n"
    );
  }
}