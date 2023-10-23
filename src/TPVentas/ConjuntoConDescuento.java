package src.TPVentas;

public class ConjuntoConDescuento extends Conjunto {
    private double descuento;
    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() - (descuento/100);
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
