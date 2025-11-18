package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Producto;
public class TestProducto {

	public static void main(String[] args) {
		Producto prod1=new Producto("Stanley",35.00);
		Producto prod2=new Producto("Oala",23.00);
		Producto prod3=new Producto("Cubit",25.00);
		
		double prod1des=prod1.calcularPrecioPromo(13);
		double prod2des=prod2.calcularPrecioPromo(2.3);
		prod3.setPrecio(-23.39);
		double prod3des=prod3.calcularPrecioPromo(20);
		
		
		System.out.println(prod1.getNombre()+" precio original "+prod1.getPrecio()+" precio con descuento "+prod1des);
		System.out.println(prod2.getNombre()+" precio original "+prod2.getPrecio()+" precio con descuento "+prod2des);
		System.out.println(prod3.getNombre()+" precio original "+prod3.getPrecio()+" precio con descuento "+prod3des);
	}

}
