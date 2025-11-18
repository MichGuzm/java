package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMonto(int monto) {
		if (monto>0) {
			return true;
		}else {
			System.out.println("El monto no puede ser cero o negativo");
			return false;
		}
	}
}
