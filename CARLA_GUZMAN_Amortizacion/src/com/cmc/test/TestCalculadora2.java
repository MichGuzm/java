package com.cmc.test;
import com.cmc.servicios.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class TestCalculadora2 {

	public static void main(String[] args) {
		 Prestamo prestamo = new Prestamo(5000, 12, 15);

	        CalculadoraAmortizacion.generarTabla(prestamo);
	        CalculadoraAmortizacion.mostrarTabla(prestamo);

	}

}
