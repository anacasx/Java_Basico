package Sesion_03.Reto_02;

public class Principal {
    public static void main(String[] args) {
        //Factura con RFC
        Factura facturaConRFC = new Factura(1500.75, "Servicio de mantenimiento", "ABC123456T89");
        
        //Factura sin RFC
        Factura facturaSinRFC = new Factura(820.50, "Compra de materiales", null);

        //Imprimir los resúmenes
        System.out.println("Factura 1:");
        System.out.println(facturaConRFC.getResumen());

        System.out.println("\nFactura 2:");
        System.out.println(facturaSinRFC.getResumen());
    }
}
