package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas=new ArrayList<Persona>();
	
		personas.add(new Persona("Raul","Rodriguez"));
		personas.add(new Persona("Leo","Messi"));
		personas.add(new Persona("Britney","Spears"));
		
		System.out.println(personas.size());
		Persona elementoPersona;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println(elementoPersona.getNombre()+"-"+elementoPersona.getApellido());
		}
	}

}
