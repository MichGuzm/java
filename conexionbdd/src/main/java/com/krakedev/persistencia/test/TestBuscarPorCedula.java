package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPorCedula {

    public static void main(String[] args) {
        try {
            Persona persona=AdminPersonas.buscarPorCedula("1716231312");
            if (persona!=null) {
                System.out.println("Persona encontrada:");
                System.out.println("Cédula: " + persona.getCedula());
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Apellido: " + persona.getApellido());
                System.out.println("Número de hijos: " + persona.getNumeroHijos());
                System.out.println("Estatura: " + persona.getEstatura());
            } else {
                System.out.println("No se encontró persona con esa cédula");
            }
        } catch (Exception e) {
            System.out.println("Error en el sistema: " + e.getMessage());
        }
    }
}