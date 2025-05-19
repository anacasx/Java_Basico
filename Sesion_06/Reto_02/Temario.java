package Sesion_06.Reto_02;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

class Tema implements Comparable<Tema> {
    private String titulo;
    private int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public int obtenerPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " (Prioridad: " + prioridad + ")";
    }
}

public class Temario {
 public static void main(String[] args) {
        List<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        Collections.sort(temas);
        System.out.println("Temas por título:");
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        temas.sort(Comparator.comparingInt(Tema::obtenerPrioridad));
        System.out.println("\nTemas por prioridad:");
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");

        System.out.println("\nRepositorio por tema:");
        for (String titulo : recursos.keySet()) {
            System.out.println("- " + titulo + ": " + recursos.get(titulo));
        }
    }
}
