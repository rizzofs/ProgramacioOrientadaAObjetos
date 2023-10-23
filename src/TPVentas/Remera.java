package src.TPVentas;

public class Remera extends Prenda{
    private double impuesto;

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio()+ this.ganancia;
    }
}
