package Sesion_04.Reto_01;

public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura("F001", "Ana Pérez", 1200.50);
        Factura f2 = new Factura("F001", "Carlos Díaz", 980.00);

        System.out.println("Factura 1: " + f1);
        System.out.println("Factura 2: " + f2);

        //Comparar con equals
        System.out.println("¿Son iguales? " + f1.equals(f2));
    }
}
