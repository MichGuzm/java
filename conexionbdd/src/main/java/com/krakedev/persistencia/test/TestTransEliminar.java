package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminTransacciones;

public class TestTransEliminar {

	public static void main(String[] args) {
		try {
            AdminTransacciones.eliminar(12);
            System.out.println("Transacción eliminada exitosamente");
            
        } catch (Exception e) {
            System.out.println("Error en el sistema al eliminar: " + e.getMessage());
        }
    }

}


