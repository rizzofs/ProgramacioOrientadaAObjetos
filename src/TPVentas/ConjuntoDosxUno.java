package src.TPVentas;

public class ConjuntoDosxUno extends Conjunto {
    @Override
    public double calcularPrecio() {
        if (remera.calcularPrecio() > prenda.calcularPrecio())
            return remera.calcularPrecio();
        else
            return prenda.calcularPrecio();
    }
}
