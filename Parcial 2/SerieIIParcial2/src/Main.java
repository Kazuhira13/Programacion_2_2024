import ManejoPagos.ProcesoPago;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProcesoPago proceso = new ProcesoPago();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. PayPal");
        System.out.println("3. Criptomoneda");
        System.out.println("4. Cuenta bancaria");

        int opcion = scanner.nextInt();

        String tipoPago ="";
        switch (opcion) {
            case 1:
                tipoPago = "Credito";
                break;
            case 2:
                tipoPago = "Paypal";
                break;
            case 3:
                tipoPago = "Cripto";
                break;
            case 4:
                tipoPago = "Banco";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.print("Ingrese el monto del pago: ");
        double monto = scanner.nextDouble();

        proceso.processPayment(tipoPago, monto);

        scanner.close();
    }
}