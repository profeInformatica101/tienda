package com.miempresa.entidad;

import java.util.ArrayList;
import java.util.List;


public class Tienda {
    private List<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<>(); // Inicializar la lista
    }
    
   
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }

    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}
