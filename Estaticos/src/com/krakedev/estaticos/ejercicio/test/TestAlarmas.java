package com.krakedev.estaticos.ejercicio.test;
import java.util.ArrayList;
import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarma;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;
public class TestAlarmas {

	public static void main(String[] args) {
		AdminAlarma admin = new AdminAlarma();
		admin.agregarAlarma(new Alarma(DiasSemana.LUNES, 5, 45));
		admin.agregarAlarma(new Alarma(DiasSemana.MARTES, 8, 30));
		admin.agregarAlarma(new Alarma(DiasSemana.JUEVES, 14, 5));
		admin.agregarAlarma(new Alarma(DiasSemana.SABADO, 20, 15));
		admin.agregarAlarma(new Alarma(DiasSemana.DOMINGO, 9, 0));
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		System.out.println("Lista de Alarmas:");
        System.out.println(alarmasActuales);
		}
	

}
