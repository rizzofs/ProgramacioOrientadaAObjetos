package src.Biblioteca2;

public class Socio {

    private String Nombre;
    private int edad;

    public Socio(String nombre, int edad) {
        Nombre = nombre;
        this.edad= edad;
    }

    public String getNombre() {
        return Nombre;
    }

}
