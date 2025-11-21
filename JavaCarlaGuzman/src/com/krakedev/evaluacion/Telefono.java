package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		
		if(numero==null||tipo==null) {
			this.estado="E";
		}else if(!tipo.equals("Movil")&&!tipo.equals("Convencional")) {
			this.estado="E";
		}else if(tipo.equals("Movil")&&numero.length()!=10) {
			this.estado="E";
		}else if(tipo.equals("Convencional")&&numero.length()!=7) {
			this.estado="E";
		}else {
			this.estado="C";
		}
	}
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
}
