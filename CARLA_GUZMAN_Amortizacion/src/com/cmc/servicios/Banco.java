package com.cmc.servicios;
import com.cmc.evaluacion.Prestamo;
import com.cmc.evaluacion.Cliente;
import java.util.ArrayList;

public class Banco {
	 private ArrayList<Prestamo> prestamos;
	    private ArrayList<Cliente> clientes;
	    
	    public Banco() {
	        this.prestamos = new ArrayList<>();
	        this.clientes = new ArrayList<>();
	    }	    
	    public ArrayList<Prestamo> getPrestamos() {
	        return prestamos;
	    }	    
	    public ArrayList<Cliente> getClientes() {
	        return clientes;
	    }	    
	    public Cliente buscarCliente(String cedula) {
	        for (Cliente cliente : clientes) {
	            if (cliente.getCedula().equals(cedula)) {
	                return cliente;
	            }
	        }
	        return null;
	    }	    
	    public void registrarCliente(Cliente cliente) {
	        Cliente existente = buscarCliente(cliente.getCedula());
	        if (existente == null) {
	            clientes.add(cliente);
	            System.out.println("Cliente registrado: " + cliente);
	        } else {
	            System.out.println("Cliente ya existe: " + cliente.getCedula());
	        }
	    }
	    public void asignarPrestamo(String cedula, Prestamo prestamo) {
	        Cliente cliente = buscarCliente(cedula);
	        if (cliente == null) {
	            System.out.println("No es cliente del banco");
	            return;
	        }
	        
	        CalculadoraAmortizacion.generarTabla(prestamo);

	        prestamos.add(prestamo);
	        
	        System.out.println("Préstamo asignado al cliente: " + cedula);
	        System.out.println("Monto: " + prestamo.getMonto() + ", Interés: " + prestamo.getInteres() + "%, Plazo: " + prestamo.getPlazo() + " meses");
	    }
	    
	    public ArrayList<Prestamo> buscarPrestamos(String cedula) {
	        Cliente cliente = buscarCliente(cedula);
	        if (cliente == null) {
	            return null;
	        }
	        
	        if (prestamos.isEmpty()) {
	            return null;
	        }
	        
	        return new ArrayList<>(prestamos);
	    }
}
