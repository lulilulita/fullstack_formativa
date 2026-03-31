package com.example.SistemaGestionProductos.model;

//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //genera get, set, tostring, equals
@AllArgsConstructor // genera constructor con todos los atributos
@NoArgsConstructor // genera constructor vacio (sin atributos)

public class Producto {
    //@NotBlank //valida que el texto no sea nulo ni este vacio
    private String nombre;
    
   // @NotNull //valida que el valor no sea nulo
    private Double precio;
    
    //@NotBlank
    private String categoria;
} 
