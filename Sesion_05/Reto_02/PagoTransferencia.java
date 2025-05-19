package Sesion_05.Reto_02;

public class PagoTransferencia extends MetodoPago implements Autenticable {

    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return Math.random() > 0.2;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia bancaria por $" + monto);
    }
}
