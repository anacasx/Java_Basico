package Sesion_06.Reto_01;

import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        //ArrayList: registrar orden de llegada de especies
        ArrayList<String> muestrasRecibidas = new ArrayList<>();
        muestrasRecibidas.add("Homo sapiens");
        muestrasRecibidas.add("Mus musculus");
        muestrasRecibidas.add("Arabidopsis thaliana");
        muestrasRecibidas.add("Homo sapiens");

        System.out.println("Muestras genéticas recibidas (orden de llegada):");
        for (int i = 0; i < muestrasRecibidas.size(); i++) {
            System.out.println((i + 1) + ". " + muestrasRecibidas.get(i));
        }

        //HashSet: especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestrasRecibidas);

        System.out.println("\nEspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        //HashMap
        HashMap<String, String> muestrasInvestigadores = new HashMap<>();
        muestrasInvestigadores.put("M-001", "Dra. López");
        muestrasInvestigadores.put("M-002", "Dr. Hernández");
        muestrasInvestigadores.put("M-003", "Dra. Ramírez");

        System.out.println("\nRegistro de ID de muestra → Investigador:");
        for (Map.Entry<String, String> entrada : muestrasInvestigadores.entrySet()) {
            System.out.println(entrada.getKey() + " " + entrada.getValue());
        }

        //Buscar nombre del investigador por ID de muestra
        String idBuscar = "M-002";
        System.out.println("\nInvestigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigadores.get(idBuscar));
    }
}
