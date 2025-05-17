package Sesion_02.Reto_02;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = 1000.0;
        int opcion;

        do {
            System.out.println("\n= = = Bienvenido = = =");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            
            opcion = scan.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Tu saldo actual es: $" + saldo);
                }

                case 2 -> {
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = scan.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor que cero.");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                }

                case 3 -> {
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = scan.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor que cero.");
                        continue;
                    }
                    if (retiro > saldo) {
                        System.out.println("No hay saldo suficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                }

                case 4 -> {
                    System.out.println("Gracias por preferirnos. ¡Hasta luego!");
                }

                default -> {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            }

        } while (opcion != 4);

        scan.close();
    }
}