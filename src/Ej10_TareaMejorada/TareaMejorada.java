package src.Ej10_TareaMejorada;

import java.time.LocalDate;

public class TareaMejorada {

    public enum Prioridad {
        URGENTE, IMPORTANTE, NO_URGENTE
    }

    private String descripcion;
    private Prioridad prioridad;
    private boolean estado;
    private LocalDate fecha;
    private LocalDate fechaRecor;

    public TareaMejorada(String descripcion, Prioridad prioridad, boolean estado, LocalDate fecha, LocalDate fechaRecor) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fecha = fecha;
        this.fechaRecor = fechaRecor;
    }

    public void crear_descripcion(String nueva_descripcion){
        descripcion = nueva_descripcion;
    }
    public void asignar_prioridad(Prioridad asignar){
        prioridad = asignar;
    }
    public void Esta_finalizada(boolean finalizada){
        estado = finalizada;
    }
    public void fecha_limite(LocalDate f_limite){
        fecha=f_limite;
    }

    public void cambiarPrioridad(){
        if(LocalDate.now().isEqual(fechaRecor) || LocalDate.now().isAfter(fechaRecor)){
            this.prioridad = Prioridad.URGENTE;
        }
    }
    public boolean esta_vencida(){
        return LocalDate.now().isAfter(fecha) && (!estado);
    }
    public boolean esCompleta(){
        return estado;
    }
    public String mostrar() {
        String x = "";
        if(esta_vencida()){
            x="(Vencida)... ";
        }
        if(LocalDate.now().isEqual(fechaRecor) || LocalDate.now().isAfter(fechaRecor)){
            x = "(por vencer)";
        }
        return x + descripcion;
    }
    public Prioridad obtener_prioridad() {
        return prioridad;
    }
    public LocalDate obtener_fecha() {
        return fecha;
    }

}
