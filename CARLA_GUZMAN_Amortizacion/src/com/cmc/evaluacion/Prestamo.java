package com.cmc.evaluacion;

import com.cmc.servicios.CalculadoraAmortizacion;
public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private Cuota[] cuotas;
	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		this.cuotas = new Cuota[plazo];
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public Cuota[] getCuotas() {
		return cuotas;
	}
	public void mostrarPrestamo() {
	    System.out.printf("[monto=%.1f, interes=%.1f, plazo=%d]%n", monto, interes, plazo);
	}

	
}