package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public Item(String nombre) {
        this.nombre = nombre;
    }
	public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }
    
    public void setProductosDevueltos(int productosDevueltos) {
        this.productosDevueltos = productosDevueltos;
    }
    
    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }
    public void imprimir() {
        System.out.println("Productos Actuales: " + productosActuales);
        System.out.println("Productos Vendidos: " + productosVendidos);
        System.out.println("Productos Devueltos: " + productosDevueltos);
    }
    public void vender(int cantidad) {
        if (cantidad <= productosActuales) {
            productosActuales -= cantidad;
            productosVendidos += cantidad;
            System.out.println("Vendidos " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficientes productos para vender " + cantidad + " unidades");
        }
    }
    public void devolver(int cantidad) {
        if (cantidad <= productosVendidos) {
            productosActuales += cantidad;
            productosVendidos -= cantidad;
            productosDevueltos += cantidad;
            System.out.println("Devueltos " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No se pueden devolver " + cantidad + " unidades (solo hay " + productosVendidos + " vendidas)");
        }
    }
    public String getNombre() {
        return nombre;
    }
    
    public int getProductosActuales() {
        return productosActuales;
    }
    
    public int getProductosDevueltos() {
        return productosDevueltos;
    }
    
    public int getProductosVendidos() {
        return productosVendidos;
    }
}
