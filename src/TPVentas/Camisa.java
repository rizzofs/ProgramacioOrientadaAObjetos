package src.TPVentas;

public class Camisa extends Prenda{
    private boolean esMangaLarga;
    private double plus;

    @Override
    public double calcularPrecio() {
        double v = super.calcularPrecio();
        return v;
    }

    public double getGanancia(){
        if(this.esMangaLarga)
            return super.getGanancia()+ this.plus;
        else
            return super.getGanancia();
    }

}
