package src.TP2.Ej_1;

public class Suscripcion {
    public enum Nivel{
        BASICO, INTERMEDIO, DESTACADO
    }
    private Nivel nivel;

    public Suscripcion(Nivel nivel){
        this.nivel = nivel;
    }
}
