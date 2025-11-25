package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		String valor = numero + "";
		if(numero < 10) {
			valor = "0" + valor;
		}
		return valor;
	}
	public static String formatearDia(int dia) {
		String nombreDia="";
		if(dia==DiasSemana.LUNES ) {
			nombreDia="Lunes";
		}else if(dia==DiasSemana.MARTES) {
			nombreDia="Martes";
		}else if(dia==DiasSemana.MIERCOLES) {
			nombreDia="Miercoles";
		}else if(dia==DiasSemana.JUEVES) {
			nombreDia="Jueves";
		}else if(dia==DiasSemana.VIERNES) {
			nombreDia="Viernes";
		}else if(dia==DiasSemana.SABADO) {
			nombreDia="Sabado";
		}else if(dia==DiasSemana.DOMINGO) {
			nombreDia="Domingo";
		}
		return nombreDia;
	}
}
