package src.Biblioteca2;

import src.ListaEnlazada;

import java.time.LocalDate;

public class BibliotecaTest {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca(new ListaEnlazada<>());

        // Crear libros
        src.Ej6_biblioteca.Libro libro1 = new src.Ej6_biblioteca.Libro("El Libro de Aventuras", "Autor A", 300, new ListaEnlazada<>());
        src.Ej6_biblioteca.Libro libro2 = new src.Ej6_biblioteca.Libro("La Novela Romántica", "Autor B", 250, new ListaEnlazada<>());

        // Agregar ejemplares a los libros
        libro1.aumentarCantidad(5);
        libro2.aumentarCantidad(3);

        // Crear socios
        Socio socio1 = new Socio("Juan Perez", 30);
        Socio socio2 = new Socio("María López", 25);

        // Crear ejemplares
        Ejemplar ejemplar1 = new Ejemplar();
        Ejemplar ejemplar2 = new Ejemplar();

        // Crear préstamos
        LocalDate fechaPrestamo1 = LocalDate.of(2023, 9, 15);
        LocalDate fechaDevolucion1 = LocalDate.of(2023, 9, 30);
        Prestamo prestamo1 = new Prestamo(fechaPrestamo1, fechaDevolucion1, socio1, ejemplar1);

        LocalDate fechaPrestamo2 = LocalDate.of(2023, 9, 20);
        LocalDate fechaDevolucion2 = LocalDate.of(2023, 10, 5);
        Prestamo prestamo2 = new Prestamo(fechaPrestamo2, fechaDevolucion2, socio2, ejemplar2);

        // Finalizar los préstamos
        prestamo1.finalizar();
        prestamo2.finalizar();

        // Verificar el estado de la biblioteca
        System.out.println("Libros prestados en la biblioteca: " + biblioteca.getLibrosPrestados());

        // Mostrar información de los libros
        biblioteca.mostrarDescripcion(libro1);
        biblioteca.mostrarDescripcion(libro2);
    }
}
