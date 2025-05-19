package Sesion_07.Reto_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        Path carpetaConfig = Paths.get("../Java_Basico/Sesion_07/Reto_01/config");
        Path rutaArchivo = carpetaConfig.resolve("parametros.txt");

        guardarParametros(rutaArchivo, carpetaConfig);
        if (Files.exists(rutaArchivo)) {
            System.out.println("El archivo fue creado correctamente.");
            leerParametros(rutaArchivo);
        } else {
            System.out.println("No se pudo crear el archivo.");
        }
    }

    public static void guardarParametros(Path rutaArchivo, Path carpeta) {
        try {
            //Crear carpeta si no existe
            if (Files.notExists(carpeta)) {
                Files.createDirectories(carpeta);
            }

            String contenido = """
                    Tiempo de ciclo: 55.8 segundos
                    Velocidad de linea: 1.2 m/s
                    Numero de estaciones: 8
                    """;

            //Escribir
            Files.write(rutaArchivo, contenido.getBytes());
            System.out.println("Parámetros guardados en: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los parámetros: " + e.getMessage());
        }
    }

    public static void leerParametros(Path rutaArchivo) {
        try {
            String contenido = Files.readString(rutaArchivo);
            System.out.println("Contenido del archivo:");
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
