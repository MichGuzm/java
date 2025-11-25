package com.krakedev.herencia;

public class Gato extends Animal{
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Gato acicalandose");
	}
}
