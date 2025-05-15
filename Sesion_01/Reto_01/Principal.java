package Sesion_01.Reto_01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Objeto tipo paciente
        Paciente paciente = new Paciente();

        //Entrada y asignación de valores
        System.out.println("Ingresa nombre del paciente:");
        paciente.nombre = scan.nextLine();

        System.out.println("Ingresa edad del paciente:");
        paciente.edad = scan.nextInt();

        System.out.println("Ingresa número de expediente del paciente:");
        paciente.no_exp = scan.nextLine();
        paciente.no_exp = scan.nextLine();

        paciente.mostrarInformacion();
    }
}
