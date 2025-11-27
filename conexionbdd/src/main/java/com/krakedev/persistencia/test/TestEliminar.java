package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

    public static void main(String[] args) {
        String cedulaAEliminar="1716232312";
        
        try {
            AdminPersonas.eliminar(cedulaAEliminar);
            System.out.println("Persona eliminada exitosamente");
            
        } catch (Exception e) {
            System.out.println("Error en el sistema: " +e.getMessage());
        }
    }
}