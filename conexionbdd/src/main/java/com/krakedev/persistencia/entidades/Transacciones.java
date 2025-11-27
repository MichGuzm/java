package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Transacciones {
	private int codigo;
	private String numeroCuenta;
	private BigDecimal monto;
	private String tipo;
	private Date fecha;
	private Date hora;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Transacciones(int codigo, String numeroCuenta, BigDecimal monto, String tipo, Date fecha, Date hora) {
		this.codigo = codigo;
		this.numeroCuenta = numeroCuenta;
		this.monto = monto;
		this.tipo = tipo;
		this.fecha = fecha;
		this.hora = hora;
	}
	public Transacciones() {}
	@Override
	public String toString() {
		return "Transacciones [codigo=" + codigo + ", numeroCuenta=" + numeroCuenta + ", monto=" + monto + ", tipo="
				+ tipo + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
}
