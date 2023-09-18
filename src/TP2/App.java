package src.TP2;

import java.util.ArrayList;

public class App {
    private ArrayList<DosDimensiones> lista2D;
    private ArrayList<TresDimensiones> lista3D;

    public App(){
        lista2D = new ArrayList<>();
        lista3D = new ArrayList<>();
    }
    public void agregarFigura(Figura figura){
        if(figura instanceof DosDimensiones){
            lista2D.add((DosDimensiones) figura);
        }
        else lista3D.add((TresDimensiones) figura);
    }
    public void eliminarFigura(int posicion, boolean esLista2D){
        if (esLista2D){
            lista2D.remove(posicion);
        }
        else{
            lista3D.remove(posicion);
        }
    }

    public ArrayList<DosDimensiones> getLista2D() {
        return lista2D;
    }

    public ArrayList<TresDimensiones> getLista3D() {
        return lista3D;
    }
}