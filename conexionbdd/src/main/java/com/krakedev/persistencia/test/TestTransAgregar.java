package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.perisistencia.utils.Convertidor;
import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.servicios.AdminTransacciones;

public class TestTransAgregar {

	public static void main(String[] args) {
		 Transacciones t2 = new Transacciones();
	        t2.setCodigo(12);
	        t2.setNumeroCuenta("14583");
	        t2.setMonto(new BigDecimal("2000.75")); 
	        t2.setTipo("C");
	        
	        try {
	            Date fecha = Convertidor.convertirFecha("2024/01/16");
	            Date hora = Convertidor.convertirHora("10:15");
	            
	            t2.setFecha(fecha);
	            t2.setHora(hora);

	            AdminTransacciones.actualizar(t2);
	            System.out.println("Transacción actualizada exitosamente");
	            
	        } catch (Exception e) {
	            System.out.println("Error en el sistema al actualizar: " + e.getMessage());
	        }


	}

}
