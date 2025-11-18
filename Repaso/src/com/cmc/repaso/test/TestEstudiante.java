package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Estudiante;
public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1=new Estudiante("Juan Perez");
		Estudiante estudiante2=new Estudiante("Maria Garzon");
		Estudiante estudiante3=new Estudiante("Carlos Lopez");
		
		estudiante1.calificar(9.3);
		estudiante2.calificar(8);
		estudiante3.calificar(4);
		
		System.out.println("Estudinate "+estudiante1.getNombre()+" "+estudiante1.getResultado());
		System.out.println("Estudinate "+estudiante2.getNombre()+" "+estudiante2.getResultado());
		System.out.println("Estudinate "+estudiante3.getNombre()+" "+estudiante3.getResultado());
	}

}
