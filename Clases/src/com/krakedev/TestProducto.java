package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		productoA.nombre1="Alcohol isopropil";
		productoA.descripcion="Alcohol 70%";
		productoA.precio=1.00;
		productoA.stockActual=120;
		
		productoB.nombre1="Gasa";
		productoB.descripcion="Gasa esteril";
		productoB.precio=0.40;
		productoB.stockActual=300;
		
		productoC.nombre1="Lancetas";
		productoC.descripcion="lancetas para diabetes";
		productoC.precio=12.00;
		productoC.stockActual=78;
		
		System.out.println("ProductoA nombre: "+productoA.nombre1);
		System.out.println("ProductoA descripcion: "+productoA.descripcion);
		System.out.println("ProductoA precio: "+productoA.precio);
		System.out.println("ProductoA stockActual: "+productoA.stockActual);
		System.out.println("*********");
		System.out.println("ProductoB nombre: "+productoB.nombre1);
		System.out.println("ProductoB descripcion: "+productoB.descripcion);
		System.out.println("ProductoB precio: "+productoB.precio);
		System.out.println("ProductoB stockActual: "+productoB.stockActual);
		System.out.println("*********");
		System.out.println("ProductoC nombre: "+productoC.nombre1);
		System.out.println("ProductoC descripcion: "+productoC.descripcion);
		System.out.println("ProductoC precio: "+productoC.precio);
		System.out.println("ProductoC stockActual: "+productoC.stockActual);
	}

}
