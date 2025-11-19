package com.cmc.directorio.entidades;

public class AdminContacto {
	 public Contacto buscarMasPesado(Contacto contacto1, Contacto contacto2) {
	        if (contacto1.getPeso() > contacto2.getPeso()) {
	            return contacto1;
	        } else {
	            return contacto2;
	        }
	 }
	 public boolean compararOperadoras(Contacto contacto1, Contacto contacto2) {
	        String operadora1 = contacto1.getTelefono().getOperadora();
	        String operadora2 = contacto2.getTelefono().getOperadora();
	        
	        if(operadora1==operadora2) {
	        	return true;
	        }else {
	        	return false;
	        }
	    }
	 public void activarUsuario(Contacto contacto) {
	        if (contacto.getTelefono().isTieneWhatsapp()) {
	            contacto.setActivo(true);
	        }
	    }
}
