package src.TP2.TP2;

public class Cubo extends TresDimensiones{
    private double base;

    public Cubo(double base){
        this.base = base;
    }

    @Override
    public double getArea() {
        return 6 * (Math.pow(base, 2));
    }

    @Override
    public double getVolumen() {
        return Math.pow(base, 3);
    }
}
