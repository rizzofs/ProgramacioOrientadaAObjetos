package src.TPVentas;

public abstract class Conjunto implements Vendible{
    protected Remera remera;
    protected Prenda prenda;

    public double calcularPrecio() {
        return remera.calcularPrecio() + prenda.calcularPrecio();
    }
}
