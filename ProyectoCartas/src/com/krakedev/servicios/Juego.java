package com.krakedev.servicios;
import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;
import java.util.ArrayList;
public class Juego {
	private Naipe naipe;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    private ArrayList<String> idsJugadores;

    public Juego(ArrayList<String> idsJugadores) {
        this.idsJugadores = idsJugadores;
        this.naipe = new Naipe();
        this.naipeBarajado = naipe.barajar();
        this.cartasJugadores = new ArrayList<>();
        for(int i = 0; i < idsJugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<Carta>());
        }
    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    public void entregarCartas(int cartasPorJugador) {
        int totalJugadores = cartasJugadores.size();
        int cartaActual = 0;
        
        for(int carta = 0; carta < cartasPorJugador; carta++) {
            for(int jugador = 0; jugador < totalJugadores; jugador++) {
                if(cartaActual < naipeBarajado.size()) {
                    cartasJugadores.get(jugador).add(naipeBarajado.get(cartaActual));
                    cartaActual++;
                }
            }
        }
    }

    public int devolverTotal(int indiceJugador) {
        int total = 0;
        
        if(indiceJugador >= 0 && indiceJugador < cartasJugadores.size()) {
            ArrayList<Carta> cartasJugador = cartasJugadores.get(indiceJugador);
            for(int i = 0; i < cartasJugador.size(); i++) {
                Carta carta = cartasJugador.get(i);
                total += carta.getNumero().getValor();
            }
        }
        
        return total;
    }

    public int devolverTotal(String idJugador) {
        int jugadorIndex = -1;
        for(int i = 0; i < idsJugadores.size(); i++) {
            if(idsJugadores.get(i).equals(idJugador)) {
                jugadorIndex = i;
                break;
            }
        }
        
        if(jugadorIndex != -1) {
            return devolverTotal(jugadorIndex);
        }
        
        return 0;
    }

    public String determinarGanador() {
        if(idsJugadores.isEmpty()) return "No hay jugadores";
        
        int indiceGanador = 0;
        int sumaGanador = devolverTotal(0);
        
        for(int i = 1; i < idsJugadores.size(); i++) {
            int sumaActual = devolverTotal(i);
            if(sumaActual >= sumaGanador) {
                sumaGanador = sumaActual;
                indiceGanador = i;
            }
        }
        
        return idsJugadores.get(indiceGanador);
    }
}
