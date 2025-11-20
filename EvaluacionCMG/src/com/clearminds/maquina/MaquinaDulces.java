package com.clearminds.maquina;

import java.util.ArrayList;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo;
    private ArrayList<Celda> celdas;
    
    public MaquinaDulces() {
        celdas = new ArrayList<Celda>(); 
        saldo = 0.0;
    }
    
    public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
        this.celda1 = new Celda(codigo1);
        this.celda2 = new Celda(codigo2);
        this.celda3 = new Celda(codigo3);
        this.celda4 = new Celda(codigo4);
    }
    
    public void mostrarConfiguracion() {
        System.out.println("Configuración de la Maquina:");
        System.out.println("Celda 1: " + celda1.getCodigo());
        System.out.println("Celda 2: " + celda2.getCodigo());
        System.out.println("Celda 3: " + celda3.getCodigo());
        System.out.println("Celda 4: " + celda4.getCodigo());
    }
    
    public Celda buscarCelda(String codigoCelda) {
        if (celda1.getCodigo().equals(codigoCelda)) {
            return celda1;
        } else if (celda2.getCodigo().equals(codigoCelda)) {
            return celda2;
        } else if (celda3.getCodigo().equals(codigoCelda)) {
            return celda3;
        } else if (celda4.getCodigo().equals(codigoCelda)) {
            return celda4;
        } else {
            return null;
        }
    }
    
    public void cargarProducto(Producto producto, String codigoCelda, int cantidadItems) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, cantidadItems);
        }
    }
    
    public void mostrarProductos() {
        System.out.println("Productos en la Maquina:");
        imprimirInfoCelda(celda1);
        imprimirInfoCelda(celda2);
        imprimirInfoCelda(celda3);
        imprimirInfoCelda(celda4);
        System.out.println("Saldo: " + saldo); 
    }
    
    private void imprimirInfoCelda(Celda celda) {
        if (celda.getProducto() != null) {
            System.out.println("Celda: " + celda.getCodigo() + 
                             " Stock: " + celda.getStock() + 
                             " Producto: " + celda.getProducto().getNombre() + 
                             " Precio: " + celda.getProducto().getPrecio());
        } else {
            System.out.println("Celda: " + celda.getCodigo() + " - Vacía");
        }
    }
    
    public Producto buscarProductoEnCelda(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null) {
            return celda.getProducto();
        } else {
            return null;
        }
    }
    
    public double consultarPrecio(String codigoCelda) {
        Producto producto = buscarProductoEnCelda(codigoCelda);
        if (producto != null) {
            return producto.getPrecio();
        } else {
            return 0.0;
        }
    }
    
    public Celda buscarCeldaProducto(String codigoProducto) {
        if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
            return celda1;
        } else if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
            return celda2;
        } else if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
            return celda3;
        } else if (celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
            return celda4;
        } else {
            return null;
        }
    }
    
    public void incrementarProductos(String codigoProducto, int cantidadIncrementar) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            int stockActual = celdaEncontrada.getStock();
            celdaEncontrada.setStock(stockActual + cantidadIncrementar);
            System.out.println("Stock aumento en celda " + celdaEncontrada.getCodigo() + 
                             ". Nuevo stock: " + celdaEncontrada.getStock());
        } else {
            System.out.println("No se encontro el producto con codigo: " + codigoProducto);
        }
    }
    
    public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
            int stockActual = celda.getStock();
            celda.setStock(stockActual - 1);
            double precioProducto = celda.getProducto().getPrecio(); 
            this.saldo += precioProducto;
            
            System.out.println("Venta: " + celda.getProducto().getNombre() + 
                             " precio: " + precioProducto);
        } else {
            System.out.println("No se puede realizar la venta en celda: " + codigoCelda);
        }
    }
    
    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
            double precioProducto = celda.getProducto().getPrecio();
            if (valorIngresado >= precioProducto) {
                int stockActual = celda.getStock();
                celda.setStock(stockActual - 1);
                this.saldo += precioProducto; 
                double cambio = valorIngresado - precioProducto; 
                System.out.println("Venta: " + celda.getProducto().getNombre() + 
                        " precio " + precioProducto + 
                        ". Cambio: $" + cambio);
                return cambio;
            } else {
                System.out.println("Saldo insuficiente. Se requiere: $" + precioProducto + 
                   ", se ingresó: $" + valorIngresado);
                return valorIngresado;
            }
        } else {
            System.out.println("No se puede realizar la venta en celda: " + codigoCelda);
            return valorIngresado; 
        }
    }
    
    public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> menores = new ArrayList<Producto>();
        agregarSiEsMenor(celda1, limite, menores);
        agregarSiEsMenor(celda2, limite, menores);
        agregarSiEsMenor(celda3, limite, menores);
        agregarSiEsMenor(celda4, limite, menores);
        
        return menores;
    }
    
    private void agregarSiEsMenor(Celda celda, double limite, ArrayList<Producto> menores) {
        if(celda != null && celda.getProducto() != null && celda.getProducto().getPrecio() <= limite) {
            menores.add(celda.getProducto());
        }
    }
    
    public void agregarCelda(String codigo) {
        Celda celda = new Celda(codigo);
        celdas.add(celda);
    }
    
    // Getters y Setters
    public Celda getCelda1() {
        return celda1;
    }
    
    public void setCelda1(Celda celda1) {
        this.celda1 = celda1;
    }
    
    public Celda getCelda2() {
        return celda2;
    }
    
    public void setCelda2(Celda celda2) {
        this.celda2 = celda2;
    }
    
    public Celda getCelda3() {
        return celda3;
    }
    
    public void setCelda3(Celda celda3) {
        this.celda3 = celda3;
    }
    
    public Celda getCelda4() {
        return celda4;
    }
    
    public void setCelda4(Celda celda4) {
        this.celda4 = celda4;
    }
    
    public double getSaldo() { 
        return saldo;
    }
    
    public void setSaldo(double saldo) { 
        this.saldo = saldo;
    }
    
    public ArrayList<Celda> getCeldas() {
        return celdas;
    }
}