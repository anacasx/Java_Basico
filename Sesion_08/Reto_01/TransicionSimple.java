package Sesion_08.Reto_01;

public class TransicionSimple implements TransicionHistoria {
    @Override
    public void avanzarEscena(String decision) {
        if ("A".equalsIgnoreCase(decision)) {
            System.out.println("Transición al bosque misterioso...");
        } else if ("B".equalsIgnoreCase(decision)) {
            System.out.println("Transición al castillo abandonado...");
        } else {
            System.out.println("Decisión no válida. Permaneces en el lugar.");
        }
    }
}
