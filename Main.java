


import java.util.Date;
import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
      
    Banco banco = new Banco();

    Cliente cliente1 = new Cliente(
      1,
      "123456789",
      "Juan",
      "Perez",
      "123 Main St",
      "555-1234",
      "juan@email.com",
      new Date()
    );
    banco.agregarCliente(cliente1);

    banco.crearCuenta(cliente1, 1000.0);

    Cliente cliente2 = new Cliente(
      2,
      "987654321",
      "Maria",
      "Lopez",
      "456 Oak St",
      "555-5678",
      "maria@email.com",
      new Date()
    );
    banco.agregarCliente(cliente2);

    banco.crearCuenta(cliente2, 2000.0);

    int opcion;
    do {
      System.out.println("Menú Principal:");
      System.out.println("1. Crear una cuenta");
      System.out.println("2. Ver el saldo de su cuenta");
      System.out.println("3. Depositar dinero");
      System.out.println("4. Retirar dinero");
      System.out.println("5. Ver un estado de cuenta");
      System.out.println("6. Salir");
      opcion = 1; // Simular entrada de usuario

      switch (opcion) {
        case 1 -> {
          System.out.println("Ingrese su número de cliente: ");
          int numeroCliente = 1; // Simular entrada de usuario
          Cliente cliente = null;
          for (Cliente c : banco.clientes) {
            if (c.getNumeroCliente() == numeroCliente) {
              cliente = c;
              break;
            }
          }
          if (cliente != null) {
            System.out.println("Ingrese el saldo inicial: ");
            double saldoInicial = 100; // Simular entrada de usuario
            banco.crearCuenta(cliente, saldoInicial);
          } else {
            System.out.println("Cliente no encontrado.");
          }
        }
        case 2 -> {
          System.out.println("Ingrese el número de su cuenta: ");
          int numeroCuenta = 1; // Simular entrada de usuario
          Cuenta cuenta = null;
          for (Cuenta c : banco.cuentas) {
            if (c.getNumero() == numeroCuenta) {
              cuenta = c;
              break;
            }
          }
          if (cuenta != null) {
            System.out.println("Saldo actual: " + cuenta.getSaldo());
          } else {
            System.out.println("Cuenta no encontrada.");
          }
        }
        case 3 -> {
          System.out.println("Ingrese el número de su cuenta: ");
          int numeroCuentaDeposito = 1; // Simular entrada de usuario
          System.out.println("Ingrese el monto a depositar: ");
          double montoDeposito = 200; // Simular entrada de usuario
          banco.depositar(numeroCuentaDeposito, montoDeposito);
        }
        case 4 -> {
          System.out.println("Ingrese el número de su cuenta: ");
          int numeroCuentaRetiro = 1; // Simular entrada de usuario
          System.out.println("Ingrese el monto a retirar: ");
          double montoRetiro = 500; // Simular entrada de usuario
          banco.retirar(numeroCuentaRetiro, montoRetiro);
        }
        case 5 -> {
          System.out.println("Ingrese el número de su cuenta: ");
          int numeroCuentaEstado = 1; // Simular entrada de usuario
          banco.mostrarEstadoDeCuenta(numeroCuentaEstado);
        }
        case 6 -> {}
        default -> System.out.println("Opción no válida.");
      }
    } while (opcion != 6);
  }
}
