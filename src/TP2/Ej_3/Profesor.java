package src.TP2.Ej_3;

import java.util.List;

public class Profesor {
    private String nombre;
    private List<Diagramacion> diagramacionesEnseñadas;

    public Profesor(String nombre, List<Diagramacion> diagramacionesEnseñadas) {
        this.nombre = nombre;
        this.diagramacionesEnseñadas = diagramacionesEnseñadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Diagramacion> getDiagramacionesEnseñadas() {
        return diagramacionesEnseñadas;
    }

    public void setDiagramacionesEnseñadas(List<Diagramacion> diagramacionesEnseñadas) {
        this.diagramacionesEnseñadas = diagramacionesEnseñadas;
    }

    public double calcularIngresos(){
        double tarifaPorDia = 10.0;
        int diasAsistencia = diagramacionesEnseñadas.stream().mapToInt(diagramacion -> diagramacion.getAlumnosAsistentes().size()).sum();
        double ingresos = tarifaPorDia * diasAsistencia;
        return ingresos;
    }
}
