package src.Biblioteca2;

public class Ejemplar {
    private int numeroEjemplar;

    private Libro libroQuePertenece;

    public boolean prestar() {
        if (libroQuePertenece.getCantidadStock() + 1 <= libroQuePertenece.getCantidadTotal()) {
            libroQuePertenece.setCantidadStock(libroQuePertenece.getCantidadStock()+1);
            return true;
        } else
            return false;
    }

    public boolean devolver() {
        if (libroQuePertenece.getCantidadStock() > 0) {
            libroQuePertenece.setCantidadStock(libroQuePertenece.getCantidadStock()-1);
            return true;
        } else
            return false;
    }


}
