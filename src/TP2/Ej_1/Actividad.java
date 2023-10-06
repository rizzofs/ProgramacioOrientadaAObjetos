package src.TP2.Ej_1;

public class Actividad {
    private String nombre;
    private Suscripcion.Nivel tipo;

    public Actividad(String nombre, Suscripcion.Nivel){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Suscripcion.Nivel getTipo(){
        return tipo;
    }
}
