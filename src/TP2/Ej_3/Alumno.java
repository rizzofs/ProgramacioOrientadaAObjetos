package src.TP2.Ej_3;

import java.util.List;

public class Alumno {
    private String nombre;
    private String datosContacto;
    private Credencial credencial;
    private List<Diagramacion> diagramacionesInscritas;

    public Alumno(String nombre, String datosContacto, Credencial credencial, List<Diagramacion> diagramacionesInscritas) {
        this.nombre = nombre;
        this.datosContacto = datosContacto;
        this.credencial = credencial;
        this.diagramacionesInscritas = diagramacionesInscritas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDatosContacto() {
        return datosContacto;
    }

    public void setDatosContacto(String datosContacto) {
        this.datosContacto = datosContacto;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public List<Diagramacion> getDiagramacionesInscritas() {
        return diagramacionesInscritas;
    }

    public void setDiagramacionesInscritas(List<Diagramacion> diagramacionesInscritas) {
        this.diagramacionesInscritas = diagramacionesInscritas;
    }
}
