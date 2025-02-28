package com.anahuac.software.parcial1.problema3.template;

public class Driver {

    public static void main(String[] args) {

        System.out.println("\n== Registro de Gas de alta presion ==\n");
        LoteDeGas loteAltaPresion = new LoteGasAltaPresion();
        loteAltaPresion.llenarLote();
        System.out.println("\n=============================\n");

        System.out.println("\n== Registro de Gas Liquido ==\n");
        LoteDeGas loteLiquido = new LoteGasLiquido();
        loteLiquido.llenarLote();
        System.out.println("\n=============================\n");

        System.out.println("\n== Registro de Gas Acetileno ==\n");
        LoteDeGas loteAcetileno = new LoteGasAcetileno();
        loteAcetileno.llenarLote();
        System.out.println("\n=============================\n");
    }
}
