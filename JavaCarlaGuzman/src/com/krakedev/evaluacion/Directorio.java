package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Directorio {
	private Date fechaModificacion;
	private ArrayList<Contacto> contactos;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	
	public Directorio() {
		fechaModificacion = new Date();
		contactos = new ArrayList<Contacto>();
		correctos=new ArrayList<Contacto>();
		incorrectos=new ArrayList<Contacto>();
	}
	public boolean agregarContacto(Contacto contacto) {
		if(buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
			fechaModificacion = new Date();
			return true;
		}
		return false;
	}
	public Contacto buscarPorCedula(String cedula) {
		for(int i=0;i<contactos.size();i++) {
			Contacto contacto=contactos.get(i);
			if(contacto.getCedula().equals(cedula)) {
				return contacto;
			}
				
		}
		return null;
	}
	public String consultarUltimaModificacion() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return formato.format(fechaModificacion);
	}
	
	public int contarPerdidos() {
		int contador=0;
		for(int i=0;i<contactos.size();i++) {
			Contacto contacto=contactos.get(i);
			if(contacto.getDireccion()==null) {
				contador++;
			}
		}
		return contador;
	}
	
	public int contarFijos() {
		int contador=0;
		for(int i=0;i<contactos.size();i++) {
			Contacto contacto=contactos.get(i);
			ArrayList<Telefono> telefonos=contacto.getTelefonos();
			for(int j=0;j<telefonos.size();j++) {
				Telefono telefono = telefonos.get(j);
				if(telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
					contador++;
					break;
				}
			}
		}
		return contador;
	}
	
	public void depurar() {
		correctos.clear();
		incorrectos.clear();
		
		for(int i=0;i<contactos.size();i++) {
			Contacto contacto=contactos.get(i);
			if(contacto.getDireccion() != null) {
				correctos.add(contacto);
			} else {
				incorrectos.add(contacto);
			}
		}
		
		contactos.clear();
	}
	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}
	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}
	
	
	
}
