package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.perisistencia.utils.Convertidor;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

//sysout solo se puede utilizar en los test
public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("U","Union Libre");
		Persona p=new Persona("1716232312","Julio","Jaramillo",ec);
		try {
			Date fechaNac=Convertidor.convertirFecha("2012/12/23");
			Date horaNac=Convertidor.convertirHora("10:23");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setNumeroHijos(2);

			AdminPersonas.insertar(p);
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	
		
	}

}
