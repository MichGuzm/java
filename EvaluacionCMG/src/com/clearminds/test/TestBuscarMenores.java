package com.clearminds.test;

import java.util.ArrayList;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		 MaquinaDulces maquina = new MaquinaDulces();
	     maquina.configurarMaquina("A1", "A2", "B1", "B2");
	     maquina.cargarProducto(new Producto("Papitas", "PAP001", 0.85), "A1", 10);
	     maquina.cargarProducto(new Producto("Doritos", "DOR002", 0.5), "A2", 8);
	     maquina.cargarProducto(new Producto("Jet", "JET003", 0.25), "B1", 15);
	     maquina.cargarProducto(new Producto("DeTodito", "TOD004", 0.6), "B2", 12);
	     
	     maquina.mostrarProductos();
	        System.out.println();
	        
	        ArrayList<Producto> productosMenores = maquina.buscarMenores(1.0);
	        
	        System.out.println("Productos Menores: " + productosMenores.size());
	        for (Producto producto : productosMenores) {
	            System.out.println("Nombre:" + producto.getNombre() + " Precio:" + producto.getPrecio());
	        }
	    }
	        
}


