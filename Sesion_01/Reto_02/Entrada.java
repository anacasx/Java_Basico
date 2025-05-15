package Sesion_01.Reto_02;

public class Entrada {
    //Atributos
    String nombre;
    double precio;

    //Constructor
    public Entrada(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Método
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombre + " | Precio: $" + precio);
    }
}
