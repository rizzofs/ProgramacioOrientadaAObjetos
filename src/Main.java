package src;

import src.Ej6_biblioteca.Biblioteca;
import src.Ej6_biblioteca.Libro;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que ejercicio le gustaria probar?\n 1-Lista Simple.\n 2-Lista Doble.\n 3-Pila.\n 4-Cola.\n 5-Tareas.\n 6-Biblioteca.");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1 -> getListaEnlazadaSimple();
            case 2 -> getListaEnlazadaDoble();
            case 3 -> getPila();
            case 4 -> getCola();
            case 5 -> getTarea();
            case 6 -> getBiblioteca();
            default -> System.out.println("Ingrese una opcion valida.");
        }

    }
    private static void getListaEnlazadaSimple(){

    }
    private static void getListaEnlazadaDoble(){

    }
    private static void getPila(){

    }
    private static void getCola(){

    }
    private static void getTarea(){
        tp1_5.Tarea tarea = new tp1_5().new Tarea("Hacer ejercicio", tp1_5.Prioridad.PENDIENTE, false, LocalDate.now().plusDays(3));

        System.out.println("Descripción de la tarea: " + tarea.mostrar());

        tarea.crear_descripcion("Hacer ejercicio en el gimnasio");
        System.out.println("Nueva descripción de la tarea: " + tarea.mostrar());

        tarea.asignar_prioridad(tp1_5.Prioridad.EN_PROCESO);
        System.out.println("Prioridad de la tarea: " + tarea.obtener_prioridad());
        ;

        tarea.fecha_limite(LocalDate.now().plusDays(2));
        System.out.println("Fecha límite de la tarea: " + tarea.obtener_fecha());


        tarea.Esta_finalizada(true);
        System.out.println("¿La tarea está completa? " + tarea.esCompleta());

        System.out.println("¿La tarea está vencida? " + tarea.esta_vencida());
    }

    private static void getBiblioteca(){
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("El Conde De Montecristo", "Alejandro Dumas", 1188);
        Libro libro2 = new Libro("Cancion De Hielo Y Fuego, Juego De Tronos", "George R.R. Martin", 1300);
        biblioteca.agregarEjemplar(libro1);
        biblioteca.agregarEjemplar(libro2);
        biblioteca.agregarCantidad(libro1, 9);
        biblioteca.mostrarDescripcion(libro1);
        biblioteca.mostrarDescripcion(libro2);
        biblioteca.prestarLibro(libro1);
        biblioteca.prestarLibro(libro2);
        biblioteca.masPaginas(libro1,libro2);
        System.out.println("La cantidad total de libros prestados es de: " + biblioteca.getLibrosPrestados());
    }
}
