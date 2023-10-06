package src.TP2.Ej_1;

import java.time.LocalDate;

public class Socio {
    private int id_socio;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private Suscripcion.Nivel nivel;
    private LocalDate fechaInscripcion;


    public Socio(int id_socio, String nombre, String apellido, String direccion, String email, Suscripcion.Nivel nivel, LocalDate fechaInscripcion){
        this.id_socio = id_socio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.nivel = nivel;
        this.fechaInscripcion = fechaInscripcion;
    }
}
