package Sesion_05.Reto_02;

public abstract class MetodoPago {
    double monto;

    public abstract void procesarPago();

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public void mostrarResumen() {
        System.out.println("Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
