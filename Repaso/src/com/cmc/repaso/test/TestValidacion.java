package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Validacion;
public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion=new Validacion();
		Validacion validacion2=new Validacion();
		Validacion validacion3=new Validacion();
		validacion.validarMonto(12);
		validacion2.validarMonto(0);
		validacion3.validarMonto(-1);
	}

}
