package Sesion_04.Reto_02;

import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible < 0) {
            System.out.println("El saldo no puede ser negativo. Se establecerá en 0.");
            this.saldoDisponible = 0;
        } else {
            this.saldoDisponible = saldoDisponible;
        }
    }

    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    //Validar RFC
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }
}
