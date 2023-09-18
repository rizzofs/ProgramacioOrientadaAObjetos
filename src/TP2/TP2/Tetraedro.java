package src.TP2.TP2;

public class Tetraedro extends TresDimensiones{
    private double arista;

    public Tetraedro(double arista){
        this.arista = arista;
    }

    @Override
    public double getArea() {
        return (Math.pow(arista, 2) * Math.sqrt(3));
    }

    @Override
    public double getVolumen() {
        return (Math.pow(arista, 3) * (Math.sqrt(2)/12));
    }
}
