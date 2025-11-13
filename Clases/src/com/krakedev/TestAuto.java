package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto("Chevrolet",2012,10000.00);
		Auto auto2=new Auto("Peugeot",2023,23000.00);
	
		
		System.out.println(auto1.getMarca());
		System.out.println(auto1.getAnio());
		System.out.println(auto1.getPrecio());
		System.out.println("***********");
		System.out.println(auto2.getMarca());
		System.out.println(auto2.getAnio());
		System.out.println(auto2.getPrecio());

	}

}
