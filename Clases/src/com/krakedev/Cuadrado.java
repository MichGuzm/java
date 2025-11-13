package com.krakedev;

public class Cuadrado {
	private int lado;
	
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int calcularArea() {
		int area=lado*lado;
		return area;
	}
	
	public int calcularPerimetro() {
		int perimetro=lado*4;
		return perimetro;
	}
}
