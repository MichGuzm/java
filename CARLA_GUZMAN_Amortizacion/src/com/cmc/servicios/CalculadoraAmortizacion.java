package com.cmc.servicios;

import com.cmc.evaluacion.Prestamo;
import com.cmc.evaluacion.Utilitario;
import com.cmc.evaluacion.Cuota;
public class CalculadoraAmortizacion {
	 public static double calcularCuota(Prestamo prestamo) {
	        double monto = prestamo.getMonto();
	        double interesAnual = prestamo.getInteres();
	        int plazo = prestamo.getPlazo();
	        
	        double interesMensual = (interesAnual / 12) / 100;

	        double numerador = monto * interesMensual;
	        double denominador = 1 - Math.pow(1 + interesMensual, -plazo);
	        double cuota = numerador / denominador;
	        
	        return Utilitario.redondear(cuota);
	    }
	 public static void generarTabla(Prestamo prestamo) {
	        double cuotaMensual = calcularCuota(prestamo);
	        double interesMensual = (prestamo.getInteres() / 12) / 100;
	        for (int i = 0; i < prestamo.getPlazo(); i++) {
	            Cuota cuota = new Cuota(i + 1);
	            cuota.setCuota(cuotaMensual);
	            prestamo.getCuotas()[i] = cuota;
	        }
	        prestamo.getCuotas()[0].setCapitalInicio(prestamo.getMonto());
	
	        for (int i = 0; i < prestamo.getPlazo(); i++) {
	            Cuota cuotaActual = prestamo.getCuotas()[i];
	            Cuota cuotaSiguiente = (i < prestamo.getPlazo() - 1) ? prestamo.getCuotas()[i + 1] : null;
	            
	            calcularValoresCuota(interesMensual, cuotaActual, cuotaSiguiente);
	        }
	        ajustarUltimaCuota(prestamo.getCuotas()[prestamo.getPlazo() - 1]);
	    }
	    
	    private static void calcularValoresCuota(double interesMensual, Cuota cuotaActual, Cuota cuotaSiguiente) {
	        double interes = cuotaActual.getCapitalInicio() * interesMensual;
	        cuotaActual.setInteres(interes);
	        double abonoCapital = cuotaActual.getCuota() - interes;
	        cuotaActual.setAbonoCapital(abonoCapital);
	        double saldo = cuotaActual.getCapitalInicio() - abonoCapital;
	        cuotaActual.setSaldo(saldo);
	        if (cuotaSiguiente != null) {
	            cuotaSiguiente.setCapitalInicio(saldo);
	        }
	    }
	    private static void ajustarUltimaCuota(Cuota ultimaCuota) {
	        double diferencia = ultimaCuota.getSaldo();
	        if (Math.abs(diferencia) > 0.01) {
	            double nuevaCuota = ultimaCuota.getCuota() + diferencia;
	            ultimaCuota.setCuota(nuevaCuota);
	            double nuevoAbonoCapital = ultimaCuota.getAbonoCapital() + diferencia;
	            ultimaCuota.setAbonoCapital(nuevoAbonoCapital);
	            
	            ultimaCuota.setSaldo(0);
	        }
	    }
	    public static void mostrarTabla(Prestamo prestamo) {
	        System.out.println("No\tCuota\t\tCapital Inicio\tInterés\t\tAbono Capital\tSaldo");        
	        for (Cuota cuota : prestamo.getCuotas()) {
	            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f%n",
	                    cuota.getNumero(),
	                    cuota.getCuota(),
	                    cuota.getCapitalInicio(),
	                    cuota.getInteres(),
	                    cuota.getAbonoCapital(),
	                    cuota.getSaldo());
	        }
	    } 
}