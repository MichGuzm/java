package com.clearminds.test;
import com.clearminds.componentes.Celda;

//la linea que genera problemas es la 9, la variable que genera problemas es el .getNombre(); No esta definido y esta en null.
public class TestCelda {

	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");

	}

}
