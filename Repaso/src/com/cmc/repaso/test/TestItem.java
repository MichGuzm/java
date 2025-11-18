package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Item;
public class TestItem {

	public static void main(String[] args) {
		 Item item1 = new Item("Laptop Gamer");
	        item1.setProductosActuales(20);
	        item1.imprimir();
	        item1.vender(5);
	        item1.imprimir();
	        item1.devolver(2);
	        item1.imprimir();
	        
	        Item item2 = new Item("Smartphone");
	        item2.setProductosActuales(15);
	        item2.setProductosVendidos(5); 
	        item2.setProductosDevueltos(1);
	        item2.imprimir();
	        item2.vender(8);
	        item2.devolver(3);
	        item2.vender(2);
	        item2.imprimir();
	}

}
