package src.TPVentas;

public abstract class Prenda implements Vendible {
    private double precioDeLista;
    protected double ganancia;

    @Override
    public double calcularPrecio() {
        double v = (this.precioDeLista * 100) + (this.getGanancia() / 100);
        return v;
    }

   // public double calcularPrecio(tarjeta: Tarjeta){
   //     return 0;
   // }
    protected double getGanancia(){
        return 10;
    }

    protected double getPrecioDeLista(){
        return  precioDeLista;
    }
}
