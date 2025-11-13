package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromedio;
		
		calcu=new Calculadora();
		resultadoSuma=calcu.sumar(5, 3);
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
	
		resultadoResta=calcu.restar(10,3);
		System.out.println("RESULTADO RESTA: 0"+resultadoResta);
		
		resultadoMultiplicar=calcu.multiplicar(10, 5);
		System.out.println("RESULTADO MULTIPLICAION: "+resultadoMultiplicar);
		
		resultadoDividir=calcu.dividir(10, 2);
		System.out.println("RESULTADO DIVIDIR: "+resultadoDividir);
		
		resultadoPromedio=calcu.promediar(10, 8, 9);
		System.out.println("RESULTADO PROMEDIO: "+resultadoPromedio);
		
		calcu.mensaje();
	}

}
