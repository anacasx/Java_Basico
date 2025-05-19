package Sesion_08.Reto_02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<Integer> consumosUnicos = new HashSet<>();

        try {
            scanner = new Scanner(System.in);
            System.out.println("Ingresa consumos de CPU (%). Escribe 'fin' para terminar:");

            while (true) {
                System.out.print(">> ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                try {
                    int consumo = Integer.parseInt(entrada);

                    if (consumo < 0 || consumo > 100) {
                        System.out.println("Valor fuera de rango (0-100%). Intenta de nuevo.");
                        continue;
                    }

                    if (!consumosUnicos.add(consumo)) {
                        System.out.println("Valor duplicado. Ya fue ingresado.");
                        continue;
                    }

                    if (consumo > 95) {
                        throw new ConsumoCriticoException("Alerta: consumo crítico detectado (" + consumo + "%)");
                    }

                    System.out.println("Registro aceptado: " + consumo + "%");

                } catch (NumberFormatException e) {
                    System.out.println("Error: ingresa un valor numérico válido.");
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }
            }

        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Recurso cerrado correctamente.");
            }
        }

        System.out.println("\nResumen de registros únicos:");
        for (int valor : consumosUnicos) {
            System.out.println(" - " + valor + "%");
        }
    }
}
