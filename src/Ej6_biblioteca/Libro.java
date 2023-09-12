package src.Ej6_biblioteca;

import src.ListaEnlazada;

public class Libro {
    private String titulo;
    private String autor;
    private int cantidadStock;
    private int cantidadTotal;
    private int cantidad_paginas;

    public Libro(String titulo, String autor, int cantidad_paginas){
        this.autor = autor;
        this.titulo = titulo;
        this.cantidad_paginas = cantidad_paginas;
        this.cantidadStock = 1;
        this.cantidadTotal = 1;
    }

    public Libro(String elLibroDeAventuras, String autorA, int cantidadPaginas, ListaEnlazada<Object> objectListaEnlazada) {
    }

    public void aumentarCantidad(int cantidadAAumentar){
        cantidadStock += cantidadAAumentar;
        cantidadTotal += cantidadAAumentar;
    }
    public boolean prestarEjemplar(){
        if (cantidadStock == 1){
            System.out.println("No hay suficientes ejemplares para poder realizar el prestamo.");
            return false;
        }
        cantidadStock--;
        System.out.println("El libro se ha prestado.");
        return true;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getCantidad_paginas(){
        return cantidad_paginas;
    }
    public int getCantidadStock(){
        return cantidadStock;
    }
    public int getCantidadTotal(){
        return cantidadTotal;
    }
}
