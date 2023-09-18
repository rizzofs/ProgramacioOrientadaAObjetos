package src.TP1.Biblioteca2;

public class Ejemplar {
    private int numeroEjemplar;

    private Libro libroQuePertenece;

    public boolean prestar() {
        int cantidadStock = libroQuePertenece.getCantidadStock();
        int cantidadTotal = libroQuePertenece.getCantidadTotal();
        if (cantidadStock + 1 <= cantidadTotal) {
            libroQuePertenece.setCantidadStock(cantidadStock + 1);
            return true;
        } else {
            return false;
        }
    }


    public boolean devolver() {
        int cantidadStock = libroQuePertenece.getCantidadStock();
        if (cantidadStock > 0) {
            libroQuePertenece.setCantidadStock(cantidadStock - 1);
            return true;
        } else {
            return false;
        }
    }



}
