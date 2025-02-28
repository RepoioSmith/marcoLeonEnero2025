package com.anahuac.software.parcial1.problema3.template;

public class LoteGasLiquido extends LoteDeGas {

    @Override
    public void registrarInicial() {
        System.out.println(
                "- PARAMETROS INICIALES:\n--- Nivel de materia prima inicial: [nivelGas].");
    }

    @Override
    public void registrarFinal() {
        System.out.println(
                "- PARAMETROS FINALES:\n--- Nivel de materia prima final: [nivelGas] ");
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
