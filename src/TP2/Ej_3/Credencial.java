package src.TP2.Ej_3;

public class Credencial {
    private int numero;
    private Alumno alumno;

    public Credencial(int numero, Alumno alumno) {
        this.numero = numero;
        this.alumno = alumno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
