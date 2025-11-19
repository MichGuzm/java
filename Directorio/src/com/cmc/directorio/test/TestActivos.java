package com.cmc.directorio.test;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.AdminTelefono;
public class TestActivos {

	public static void main(String[] args) {
		 Telefono telef = new Telefono( "claro", "0981234567",12);
	        
		 Contacto contacto = new Contacto("González", telef, 70.0);
		 
		 AdminContacto adminContactos = new AdminContacto();
	     AdminTelefono adminTelefono = new AdminTelefono();
		 
	     System.out.println("Apellido: " + contacto.getApellido());
	     System.out.println("Operadora: " + contacto.getTelefono().getOperadora());
	     System.out.println("Tiene WhatsApp: " + contacto.getTelefono().isTieneWhatsapp());
	     System.out.println("Activo: " + contacto.isActivo());
	     
	     adminTelefono.activarMensajeria(telef);
	     adminContactos.activarUsuario(contacto);
	     System.out.println("Apellido: " + contacto.getApellido());
	     System.out.println("Operadora: " + contacto.getTelefono().getOperadora());
	     System.out.println("Tiene WhatsApp: " + contacto.getTelefono().isTieneWhatsapp());
	     System.out.println("Activo: " + contacto.isActivo());
	     
	     if (!contacto.isActivo()) {
	            System.out.println("El contacto NO se activó porque no tiene WhatsApp");
	        } else {
	            System.out.println("Error: El contacto se activó pero no debería");
	        }
	    }
	

}
