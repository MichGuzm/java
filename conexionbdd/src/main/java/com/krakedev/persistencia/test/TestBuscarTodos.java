package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarTodos {

    public static void main(String[] args) {
        try {
            ArrayList<Persona> personas = AdminPersonas.buscarTodos();
            System.out.println("Total de personas: " + personas.size());
            
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                System.out.println("Cédula: " + persona.getCedula() + 
                                 ", Nombre: " + persona.getNombre() + 
                                 ", Apellido: " + persona.getApellido());
            }
        } catch (Exception e) {
            System.out.println("Error en el sistema: " + e.getMessage());
            e.printStackTrace();
        }
    }
}