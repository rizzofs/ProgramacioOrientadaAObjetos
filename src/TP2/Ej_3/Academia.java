package src.TP2.Ej_3;

import java.util.List;

public class Academia {
    private List<Alumno> alumnos;
    private List<Diagramacion> diagramaciones;
    private List<Profesor> profesores;
    private List<Salon> salones;

    public Academia(List<Alumno> alumnos, List<Diagramacion> diagramaciones, List<Profesor> profesores, List<Salon> salones) {
        this.alumnos = alumnos;
        this.diagramaciones = diagramaciones;
        this.profesores = profesores;
        this.salones = salones;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Diagramacion> getDiagramaciones() {
        return diagramaciones;
    }

    public void setDiagramaciones(List<Diagramacion> diagramaciones) {
        this.diagramaciones = diagramaciones;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Salon> getSalones() {
        return salones;
    }

    public void setSalones(List<Salon> salones) {
        this.salones = salones;
    }

    public double calcularIngresosTotales(){
        double ingresosTotales=0.0;

        for(Diagramacion diagramacion: diagramaciones){
            Profesor profesor = diagramacion.getProfesor();
            ingresosTotales+=profesor.calcularIngresos();
        }
        return ingresosTotales;


    }
    public String disciplinaMasRentable(){
        String disciplinaMasRentable = null;
        double ingresosMaximos = 0.0;

        for(Diagramacion diagramacion : diagramaciones){
            double ingresosDiagramacion = diagramacion.getProfesor().calcularIngresos();
            if(ingresosDiagramacion > ingresosMaximos){
                ingresosMaximos =ingresosDiagramacion;
                disciplinaMasRentable =diagramacion.getDisciplina();
            }
        }
        return disciplinaMasRentable;
    }
}
