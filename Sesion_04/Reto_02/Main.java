package Sesion_04.Reto_02;

public class Main {
    public static void main(String[] args) {
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("ABC123456X9", 15000.00);

        CuentaFiscal cuenta = new CuentaFiscal("ABC123456X9", 20000.00);

        System.out.println("Declaración de impuestos:");
        System.out.println(declaracion);

        System.out.println("\nCuenta Fiscal:");
        System.out.println("RFC: " + cuenta.getRfc());
        System.out.println("Saldo disponible: $" + cuenta.getSaldoDisponible());

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("\n¿El RFC coincide?: " + (rfcValido ? "Sí" : "No"));
    }
}
