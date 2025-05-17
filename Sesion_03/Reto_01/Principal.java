package Sesion_03.Reto_01;

public class Principal {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "A1234567");
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        if (vuelo1.reservarAsiento(pasajero1)) {
            System.out.println("Reserva realizada con éxito.");
        }

        System.out.println();
        System.out.println(vuelo1.obtenerItinerario());

        System.out.println();
        vuelo1.cancelarReserva();

        System.out.println();
        System.out.println(vuelo1.obtenerItinerario());

        System.out.println();
        vuelo1.reservarAsiento("Mario Gonzalez", "M9988776");

        System.out.println();
        System.out.println(vuelo1.obtenerItinerario());
    }
}
