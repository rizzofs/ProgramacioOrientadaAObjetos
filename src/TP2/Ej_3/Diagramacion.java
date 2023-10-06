package src.TP2.Ej_3;

import java.util.List;

public class Diagramacion {
    privat String dia;
    privat String horario;
    privat String nivel;
    privat String diciplina;
    privat Profesor profesor;
    private Salon salon;
    private List<Alumno> alumnosAsistentes;

    public Diagramacion(privat string, privat string1, privat string2, privat string3, privat profesor, Salon salon, List<Alumno> alumnosAsistentes) {
        String = string;
        String = string1;
        String = string2;
        String = string3;
        Profesor = profesor;
        this.salon = salon;
        this.alumnosAsistentes = alumnosAsistentes;
    }

    public privat getString() {
        return String;
    }

    public void setString(privat string) {
        String = string;
    }

    public src.TP2.Ej_3.Profesor getProfesor() {
        return Profesor;
    }

    public void setProfesor(privat profesor) {
        Profesor = profesor;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public List<Alumno> getAlumnosAsistentes() {
        return alumnosAsistentes;
    }

    public void setAlumnosAsistentes(List<Alumno> alumnosAsistentes) {
        this.alumnosAsistentes = alumnosAsistentes;
    }
}
