package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.perisistencia.utils.Convertidor;
import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.servicios.AdminTransacciones;

public class TestAdminTransacciones {

    public static void main(String[] args) {

        Transacciones t1 = new Transacciones();
        t1.setCodigo(12);
        t1.setNumeroCuenta("14586");
        t1.setMonto(new BigDecimal("1500.50"));
        t1.setTipo("D"); 
        
        try {
            Date fecha=Convertidor.convertirFecha("2024/01/15");
            Date hora=Convertidor.convertirHora("14:25");
            
            t1.setFecha(fecha);
            t1.setHora(hora);

            AdminTransacciones.insertar(t1);
            System.out.println("Transacción insertada exitosamente");
            
        } catch (Exception e) {
            System.out.println("Error en el sistema al insertar: " + e.getMessage());
        }

    }
}