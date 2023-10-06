package src.TP2.Ej_2;

import java.awt.*;

public class PaqueteTurismo {
    private Destino destino;
    private Transporte transporte;
    private Hospedaje hospedaje;
    private List<Excursion> excursiones = new List();


    public void agregarExcursion(Excursion excursion){
        excursiones.add(excursion);
    }

    public PaqueteTurismo(Destino destino, Transporte transporte, Hospedaje hospedaje, List<Excursion> excursiones) {
        this.destino = destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;

    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }

    public List<Excursion> getExcursiones() {
        return excursiones;
    }

}
