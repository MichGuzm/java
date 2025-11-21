package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<Telefono>();
	}
	
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public void imprimir() {
		System.out.println("***" + nombre + " " + apellido + "***");
		if(direccion != null) {
			System.out.println("Dirección: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una dirección");
		}
	}
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	public void mostrarTelefonos() {
		System.out.println("Telefonos con estado 'C':");
		for (int i=0;i<telefonos.size();i++) {
			Telefono telefono=telefonos.get(i);
			if(telefono.getEstado().equals("C")) {
				System.out.println("Numero: "+telefono.getNumero()+", Tipo: "+telefono.getTipo());
			}
		}
	}
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> incorrectos=new ArrayList<Telefono>();
		for (int i=0;i<telefonos.size();i++) {
			Telefono telefono=telefonos.get(i);
			if(telefono.getEstado().equals("E")) {
				incorrectos.add(telefono);
			}
		}
		return incorrectos;
	}
}
