package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		admin.agregar(new Persona("Mario","Benedetti",50));
		admin.agregar(new Persona("Felicia","Ayala",32));
		admin.agregar(new Persona("Itzel","Lopez",28));
		admin.imprimir();
		
		Persona p1=admin.buscarPorNombre("Felicia");
		if(p1!=null) {
			System.out.println("Encontrado: "+p1.getApellido()+" "+p1.getEdad());
		}else {
		System.out.println("Persona no existe");
		}
		
		ArrayList<Persona> personasMayores=admin.buscarMayores(25);
		System.out.println(personasMayores.size());
	}

}
