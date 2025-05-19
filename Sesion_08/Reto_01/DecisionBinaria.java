package Sesion_08.Reto_01;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer?\nA: Ir al bosque     B: Ir al castillo");
        return scanner.nextLine();
    }
}
