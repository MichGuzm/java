package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.perisistencia.utils.Convertidor;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestActualizar {

    public static void main(String[] args) {
        EstadoCivil ec=new EstadoCivil("C", "Casado");
        Persona p=new Persona("1716232312", "Carlos", "Mendoza", ec);
        
        try {
            Date fechaNac=Convertidor.convertirFecha("1990/05/15");
            Date horaNac=Convertidor.convertirHora("14:30");
            
            p.setFechaNacimiento(fechaNac);
            p.setHoraNacimiento(horaNac);
            p.setNumeroHijos(3);
            p.setEstatura(1.75);
            p.setCantidadAhorrada(new BigDecimal(5000.00));

            AdminPersonas.actualizar(p);
            System.out.println("Persona actualizada exitosamente");
            
        } catch (Exception e) {
            System.out.println("Error en el sistema: " + e.getMessage());
        }
    }
}