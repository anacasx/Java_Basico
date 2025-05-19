package Sesion_07.Reto_02;

import java.io.*;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        String archivoLogs = "../Java_Basico/Sesion_07/Reto_02/errores.log";
        String archivoErrores = "../Java_Basico/Sesion_07/Reto_02/registro_fallos.txt";

        int totalLineas = 0;
        int cantidadErrores = 0;
        int cantidadWarnings = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivoLogs))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    cantidadErrores++;
                }

                if (linea.contains("WARNING")) {
                    cantidadWarnings++;
                }
            }
            System.out.println("Resumen:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + cantidadErrores);
            System.out.println("Cantidad de advertencias: " + cantidadWarnings);

            double porcentajeErrores = (totalLineas > 0) ? (cantidadErrores * 100.0 / totalLineas) : 0;
            double porcentajeWarnings = (totalLineas > 0) ? (cantidadWarnings * 100.0 / totalLineas) : 0;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            System.err.println("Ocurrió un error al procesar el archivo: " + e.getMessage());

            // Registrar el error en archivo de fallos
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoErrores, true))) {
                escritor.write("Error al analizar el archivo '" + archivoLogs + "': " + e.getMessage());
                escritor.newLine();
            } catch (IOException ex) {
                System.err.println("No se pudo escribir en el archivo de registro de fallos.");
            }
        }
    }
}
