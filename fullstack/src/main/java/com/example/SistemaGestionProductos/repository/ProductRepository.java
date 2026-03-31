package com.example.SistemaGestionProductos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SistemaGestionProductos.model.Producto;

@Repository
public class ProductRepository {

    private List<Producto>listaProductos = new ArrayList<>();

    //listar productos
    public List<Producto> obtenerProductos() {
        return listaProductos;
    }

    //agregar productos
    public Producto agregaProducto(Producto producto) {
        listaProductos.add(producto);
        return producto;
    }
       
    //eliminar productos
    public boolean eliminar(String nombre) {
        return listaProductos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
}


}
