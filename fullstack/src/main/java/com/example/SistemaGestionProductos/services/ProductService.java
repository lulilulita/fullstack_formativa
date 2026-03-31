package com.example.SistemaGestionProductos.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.SistemaGestionProductos.model.Producto;
import com.example.SistemaGestionProductos.repository.ProductRepository;

public class ProductService {

    @Autowired
    public ProductRepository repository;


    //listar productos
    public List<Producto> obtenerProductos() {
        return repository.obtenerProductos();
    }

    //agregar productos
    public Producto agregaProducto(Producto producto) {
        return repository.agregaProducto(producto);
    }

    //eliminar 
    public boolean eliminarProducto(String nombre) {
       return repository.eliminar(nombre);
        
}

}
