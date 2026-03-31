package com.example.SistemaGestionProductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SistemaGestionProductos.model.Producto;
import com.example.SistemaGestionProductos.services.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController //convierte la clase en api
@RequestMapping("/api/v1/productos") //ruta base para acceder a los endpoints de esta clase


public class ProductController { 
    @Autowired
    private ProductService service;


    @GetMapping //metodo get para listar productos
    public List<Producto> obtenerProductos() {
        return service.obtenerProductos();
    }
    
    @PostMapping //metodo post para agregar (crear) productos
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto) {
        return ResponseEntity.ok(service.agregaProducto(producto));
    }

    @DeleteMapping("/{nombre}") //metodo delete para eliminar productos por nombre
    public ResponseEntity<String> eliminarProducto(@PathVariable String nombre) {
        boolean eliminado = service.eliminarProducto(nombre);
        if (eliminado) {
            return ResponseEntity.ok("Producto eliminado exitosamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
