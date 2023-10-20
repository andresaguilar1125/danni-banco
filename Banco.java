//import java.util.ArrayList;


/* 
Danni class Banco se puede definir bajo class Main
No es la mejor alternativa pero mantener los objetos simples las listas almacenan informacion bancaria List<t> 
Aparte que en las instrucciones te piden crear 4 clases
Esta clase estaria demas
*/



//public class Banco {
  // public ArrayList<Cliente> clientes = new ArrayList<>();
  // public ArrayList<Cuenta> cuentas = new ArrayList<>();
  // public ArrayList<Transaccion> transacciones = new ArrayList<>();

  // public void agregarCliente(Cliente cliente) {
  //   clientes.add(cliente);
  // }

  // public void crearCuenta(Cliente cliente, double saldoInicial) {
  //   Cuenta cuenta = new Cuenta(cliente, saldoInicial);
  //   cuentas.add(cuenta);
  // }

  // public void depositar(int numeroCuenta, double monto) {
  //   for (Cuenta cuenta : cuentas) {
  //     if (cuenta.getNumero() == numeroCuenta) {
  //       cuenta.depositar(monto);
  //       Transaccion transaccion = new Transaccion(
  //         "Deposito",
  //         numeroCuenta,
  //         Double.parseDouble(cuenta.getSaldo()),
  //         monto
  //       );
  //       transacciones.add(transaccion);
  //       return;
  //     }
  //   }
  //   System.out.println("Cuenta no encontrada.");
  // }

  // public void retirar(int numeroCuenta, double monto) {
  //   for (Cuenta cuenta : cuentas) {
  //     if (cuenta.getNumero() == numeroCuenta) {
  //       if (cuenta.retirar(monto)) {
  //         Transaccion transaccion = new Transaccion(
  //           "Retiro",
  //           numeroCuenta,
  //           Double.parseDouble(cuenta.getSaldo()),
  //           -monto
  //         );
  //         transacciones.add(transaccion);
  //       } else {
  //         System.out.println("Fondos insuficientes para realizar el retiro.");
  //       }
  //       return;
  //     }
  //   }
  //   System.out.println("Cuenta no encontrada.");
  // }

  // public void mostrarEstadoDeCuenta(int numeroCuenta) {
  //   for (Transaccion transaccion : transacciones) {
  //     if (transaccion.getNumeroCuenta() == numeroCuenta) {
  //       System.out.println(transaccion);
  //     }
  //   }
  // }
//}