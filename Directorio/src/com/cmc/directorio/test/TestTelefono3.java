package com.cmc.directorio.test;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminTelefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telefono1 = new Telefono("movi", "0981111111",23);
        Telefono telefono2 = new Telefono("claro", "0982222222",12);
        Telefono telefono3 = new Telefono("movi", "0983333333",43);
        
        AdminTelefono admin = new AdminTelefono();
        System.out.println("=== TELÉFONOS CREADOS ===");
        System.out.println("Teléfono 1 - Operadora: " + telefono1.getOperadora());
        System.out.println("Teléfono 2 - Operadora: " + telefono2.getOperadora());
        System.out.println("Teléfono 3 - Operadora: " + telefono3.getOperadora());
        
        int cantidadMovi = admin.contarMovi(telefono1, telefono2, telefono3);
        System.out.println("\n=== RESULTADO DE CONTAR MOVI ===");
        System.out.println("Cantidad de teléfonos con operadora 'movi': " + cantidadMovi);
		}
	
}

