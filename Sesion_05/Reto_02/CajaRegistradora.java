package Sesion_05.Reto_02;

public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
            new PagoEfectivo(100),
            new PagoTarjeta(200, 150),
            new PagoTarjeta(50, 300),
            new PagoTransferencia(120),
            new PagoTransferencia(80)
        };

        for (MetodoPago pago : pagos) {
            if (((Autenticable) pago).autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. Transferencia no válida.");
            }
            System.out.println("----------------");
        }
    }
}
