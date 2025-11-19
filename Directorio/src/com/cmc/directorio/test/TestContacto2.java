package com.cmc.directorio.test;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.AdminContacto;
public class TestContacto2 {

	public static void main(String[] args) {
		Telefono telef1 = new Telefono("movi", "0991111111",12);
        Telefono telef2 = new Telefono("movi", "0992222222",23);
        Contacto c1 = new Contacto("López", telef1, 58.2);
        Contacto c2 = new Contacto("Rodríguez", telef2, 58.2);
        AdminContacto admin = new AdminContacto();
        Contacto masPesado = admin.buscarMasPesado(c1, c2);
        System.out.println("=== CONTACTO MÁS PESADO ===");
        System.out.println("Apellido: "+ " " + masPesado.getApellido());
        System.out.println("Peso: " + masPesado.getPeso());
        boolean mismaOperadora = admin.compararOperadoras(c1, c2);
        System.out.println("¿Tienen la misma operadora? " + mismaOperadora);
 
	}

}
