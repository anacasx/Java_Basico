package Sesion_02.Reto_01;

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        //Atributos
        String nombre;
        double precio;
        int cantidad;
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre del medicamento");
        nombre = scan.nextLine();
        System.out.println("Precio unitario");
        precio = scan.nextDouble();
        System.out.println("Cantidad de piezas");
        cantidad = scan.nextInt();

        //Cálculo
        double total = precio * cantidad;

        var aplicaDescuento = total > 500;

        double descuento = aplicaDescuento ? total * 0.15 : 0;

        System.out.println("===Resumen===\nMedicamento: " + nombre + "\nCantidad: " + cantidad + "\nPrecio unitario: $" + precio + "\nTotal sin descuento: $" + total + "\n¿Aplica descuento?: " + aplicaDescuento + "\nDescuento: $" + descuento + "\nTotal a pagar: $" + (total - descuento));
    }
}
