package com.cmc.directorio.test;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.AdminContacto;
public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef1 = new Telefono("movi", "0987654321",23);
        Telefono telef2 = new Telefono("claro", "0976543210",43);
        
        Contacto c1 = new Contacto("García", telef1, 65.5);
        Contacto c2 = new Contacto("Martínez", telef2, 72.3);
        
        AdminContacto admin = new AdminContacto();
        Contacto masPesado = admin.buscarMasPesado(c1, c2);
        System.out.println("Apellido: " + masPesado.getApellido());
        System.out.println("Peso: " + masPesado.getPeso());
        
        boolean mismaOperadora = admin.compararOperadoras(c1, c2);
        System.out.println("¿Tienen la misma operadora? " + mismaOperadora);
	}

}
