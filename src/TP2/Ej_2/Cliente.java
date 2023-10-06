package src.TP2.Ej_2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<PaqueteTurismo> compras = new ArrayList<>();

    public void comprarPaquete(PaqueteTurismo paquete){
        compras.add(paquete);
    }

    public Cliente(String nombre, List<PaqueteTurismo> compras) {
        this.nombre = nombre;
        this.compras = compras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PaqueteTurismo> getCompras() {
        return compras;
    }

}
