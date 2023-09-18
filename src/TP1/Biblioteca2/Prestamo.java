package src.TP1.Biblioteca2;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fecha;
    private LocalDate fechaDevolucion;

    private Socio socio;
    private Ejemplar ejemplarPrestado;

    public Prestamo(LocalDate fecha, LocalDate fechaDevolucion, Socio socio, Ejemplar ejemplarPrestado) {
        this.fecha = fecha;
        this.fechaDevolucion = fechaDevolucion;
        this.socio = socio;
        this.ejemplarPrestado = ejemplarPrestado;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Ejemplar getEjemplarPrestado() {
        return ejemplarPrestado;
    }

    public void finalizar(){
        if (this.getFechaDevolucion().isAfter(LocalDate.now())){
            System.out.println("El préstamo ha sido finalizado.");
        } else {
            System.out.println("El préstamo ya ha vencido.");
        }
    }
}
