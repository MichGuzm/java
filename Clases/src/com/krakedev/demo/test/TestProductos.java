package com.krakedev.demo.test;
 import com.krakedev.demo.Productos;
public class TestProductos {

	public static void main(String[] args) {
		
		Productos producto1=new Productos(12,"Laptop gamer");
		producto1.setDescripcion("Laptop ultima generacion");
		producto1.setPeso(2.00);
		
		System.out.println("Codigo producto: "+producto1.getCodigo());
		System.out.println("Nombre producto: "+producto1.getNombre());
		System.out.println("Descripcion producto: "+producto1.getDescripcion());
		System.out.println("Peso producto: "+producto1.getPeso());
	}

}
