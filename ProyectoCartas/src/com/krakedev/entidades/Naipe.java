package com.krakedev.entidades;
import java.util.ArrayList;
import com.krakedev.servicios.Random;
public class Naipe {
	 private ArrayList<Numero> numerosPosibles;
	 private ArrayList<Carta> cartas;

	    public Naipe() {
	        this.numerosPosibles = new ArrayList<>();
	        this.cartas = new ArrayList<>();
	        numerosPosibles.add(new Numero("A", 11));
	        numerosPosibles.add(new Numero("2", 2));
	        numerosPosibles.add(new Numero("3", 3));
	        numerosPosibles.add(new Numero("4", 4));
	        numerosPosibles.add(new Numero("5", 5));
	        numerosPosibles.add(new Numero("6", 6));
	        numerosPosibles.add(new Numero("7", 7));
	        numerosPosibles.add(new Numero("8", 8));
	        numerosPosibles.add(new Numero("9", 9));
	        numerosPosibles.add(new Numero("10", 10));
	        numerosPosibles.add(new Numero("J", 10));
	        numerosPosibles.add(new Numero("Q", 10));
	        numerosPosibles.add(new Numero("K", 10));
	        Palos palos = new Palos();
	        for(int i = 0; i < numerosPosibles.size(); i++) {
	            Numero numero = numerosPosibles.get(i);
	            cartas.add(new Carta(numero, palos.getCorazonRojo()));
	            cartas.add(new Carta(numero, palos.getCorazonNegro()));
	            cartas.add(new Carta(numero, palos.getDiamante()));
	            cartas.add(new Carta(numero, palos.getTrebol()));
	        }
	    }
	    public ArrayList<Carta> getCartas() {
	        return cartas;
	    }
	    public ArrayList<Carta> barajar() {
	        ArrayList<Carta> auxiliar = new ArrayList<>();
	        
	        for(int i=0;i<100;i++) {
	            int posicion = Random.obtenerPosicion();
	            Carta carta = cartas.get(posicion);
	            
	            if(carta.getEstado().equals("N")) {
	                auxiliar.add(carta);
	                carta.setEstado("C");
	            }
	        }
	        for(int i=0;i<cartas.size();i++) {
	            Carta carta = cartas.get(i);
	            if(carta.getEstado().equals("N")) {
	                auxiliar.add(carta);
	                carta.setEstado("C");
	            }
	        }
	        
	        return auxiliar;
	    }
}
