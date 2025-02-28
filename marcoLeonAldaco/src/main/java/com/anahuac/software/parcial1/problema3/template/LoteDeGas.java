package com.anahuac.software.parcial1.problema3.template;

abstract class LoteDeGas {

    public final void llenarLote() {
        registrarInicial();
        registrarFinal();
        calcularVolumen();
        inspeccionar();
        imprimirReporte();
    }
    public abstract void registrarInicial();
    public abstract void registrarFinal();
    public abstract void calcularVolumen();
    public abstract void inspeccionar();

    public void imprimirReporte() {
        System.out.println("-- Reporte de llenado:\n --- Fecha: [fecha],\n --- Cantidad: [cantidad], \n --- Firma del operador:");
    }
}