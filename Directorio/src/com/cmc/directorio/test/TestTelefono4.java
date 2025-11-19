package com.cmc.directorio.test;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminTelefono;
public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telefono1 = new Telefono("claro", "0991111111",23);
        Telefono telefono2 = new Telefono("movi", "0992222222",12);
        Telefono telefono3 = new Telefono("claro", "0993333333",19);
        Telefono telefono4 = new Telefono("claro", "0994444444",07);
        AdminTelefono admin = new AdminTelefono();
        System.out.println("=== TELÉFONOS CREADOS ===");
        System.out.println("Teléfono 1 - Operadora: " + telefono1.getOperadora());
        System.out.println("Teléfono 2 - Operadora: " + telefono2.getOperadora());
        System.out.println("Teléfono 3 - Operadora: " + telefono3.getOperadora());
        System.out.println("Teléfono 4 - Operadora: " + telefono4.getOperadora());
        System.out.println("=== ===");
        
        int cantidadClaro = admin.contarClaro(telefono1, telefono2, telefono3,telefono4);
        System.out.println("Cantidad de teléfonos con operadora Claro: " + 
                cantidadClaro);
	}

}
