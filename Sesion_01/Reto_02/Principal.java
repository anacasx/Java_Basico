package Sesion_01.Reto_02;

public class Principal {
    public static void main(String[] args) {
        //Objetos
        Entrada entrada1 = new Entrada("Carnaval", 200);
        Entrada entrada2 = new Entrada("Concierto", 1500);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
    }
}
