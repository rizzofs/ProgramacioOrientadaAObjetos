package src.TP2.Ej_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Club {
    private ArrayList<Socio> socios;
    private ArrayList<Actividad> actividades;

    public Club(){
        this.socios = new ArrayList<>();
        this.actividades = new ArrayList<>();
    }

    public void agregarSocio(Socio socio){
        socios.add(socio);
    }

    public void agregarActividad(Actividad actividad){
        actividades.add(actividad);
    }

    public void reporteMensualSocio(){
        LocalDate fechaActual = LocalDate.now();
        int nuevoSocio = 0;
        for (Socio socio : socios){
            LocalDate fechaInscripcion = socios.getfechaInscripcion();
            if (fechaInscripcion.getMonth() == fechaActual.getMonth() && fechaInscripcion.getYear() == fechaActual.getYear()){
                nuevoSocio++;
            }
        }
    }

    public void listarSocioPorSuscripcion(Suscripcion.Nivel tipo){
        System.out.println("Socio con suscripcion " + tipo + ": ");
        for (Socio socio : socios){
            if (socio.getSuscripcion().equalsIgnoreCase(tipo)){
                System.out.println("-" + socio.getNombre() + " " + socio.getApellido());
            }
        }
    }
}