package com.anahuac.software.parcial1.problema3.template;

public class LoteGasAcetileno extends LoteDeGas{

    @Override
    public void registrarInicial() {
        System.out.println(
                "- PARAMETROS INICIALES:\n--- Cantidad inicial de tambores: [Cantidad inicial de tambores].");
    }

    @Override
    public void registrarFinal() {
        System.out.println(
                "- PARAMETROS FINALES:\n--- Cantidad final de tambores: [Cantidad final de tambores].");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("- Volumen de envasado: [Cantidad de volumen].");
    }

    @Override
    public void inspeccionar() {
        System.out.println("- Inspecciones de seguridad: [checklist].");
    }
}
