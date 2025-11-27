package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		String a="snsns";
		try {
			System.out.println("ABRE LA CONEXION BDD");
			a.substring(3);
			System.out.println("fin");
			System.out.println("CIERRA LA CONEXION BDD");
		}catch(Exception ex) {
			System.out.println("entra al catch");
		}finally {
			System.out.println("ingreso al final");
			System.out.println("CIERRA LA CONEXION BDD");
		}
		System.out.println("fuera del catch");
		

	}

}
