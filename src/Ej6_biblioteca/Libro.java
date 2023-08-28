package src.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int cantidad;
    private int cantidad_paginas;

    public Libro(String titulo, String autor, int cantidad_paginas){
        this.autor = autor;
        this.titulo = titulo;
        this.cantidad_paginas = cantidad_paginas;
        this.cantidad = 1;
    }

    public void aumentarCantidad(int cantidadAAumentar){
        cantidad += cantidadAAumentar;
    }
    public boolean prestarEjemplar(){
        if (cantidad == 1){
            System.out.println("No hay suficientes ejemplares para poder realizar el prestamo.");
            return false;
        }
        cantidad--;
        System.out.println("El libro se ha prestado.");
        return true;
    }
}
