package com.krakedev.controlflujo;

public class Validador {
	public void validarEdad(int edad) {
		if(edad>=18) {
			System.out.println("Es mayor de edad");
		}else if(edad>=12 && edad<18){
			System.out.println("Es adolescente");
		}else if(edad>0 && edad<12) {
			System.out.println("Es ninio");
		}else {
			System.out.println("Edad incorrecta");
		}
	}

	}
