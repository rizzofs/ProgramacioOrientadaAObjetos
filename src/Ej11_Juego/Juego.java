package src.Ej11_Juego;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private ArrayList<Jugador> listaJugadores;
    private int puntaje;
    private ArrayList<String> diccionario;


    public Juego() {
        ArrayList<Jugador> listaJugadores= new ArrayList<>();
        ArrayList<String> diccionario =new ArrayList<>();
        String usuario1 = "Jugador 1";
        String usuario2 = "Jugador 2";
        Jugador usuario =new Jugador(usuario1);
        Jugador usuarioB =new Jugador(usuario2);
        listaJugadores.add(usuario);
        listaJugadores.add(usuarioB);
    }

    public void agregarPalabraValida(String palabraValida) {

        ArrayList<String> diccionario =new ArrayList<>();
        this.diccionario.add(palabraValida);
    }

    public boolean validarPalabra(String palabra){
       return diccionario.contains(palabra);
    }
    public void ingresarPalabra() {
        ArrayList<String> palabrasJ1 = null;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Ingrese la palabra " + i);
            String palabra = sc.next();
            palabrasJ1.add(palabra);
        }
    }

    private void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int calcularPuntaje(ArrayList<String> palabrasJ1) {
        int puntaje = 0;
        for (int i = 0; i < palabrasJ1.size(); i++) {
            String palabraAEvaluar = palabrasJ1.get(i);
            for (int j = 0; j < palabraAEvaluar.length(); j++) {
                if (palabraAEvaluar.charAt(j) == 'k') {
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'z') {
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'x') {
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'y') {
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'w') {
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'q') {
                    puntaje++;
                }
            }
            puntaje += palabraAEvaluar.length();
            setPuntaje(puntaje);
        }
        return puntaje;
    }

    public void cargarPuntosJugador(int puntaje) {
        Jugador jugador = null;
        jugador.setPuntaje(puntaje);
    }

    public void evaluarGanador() {
        for (int x = 0; x < listaJugadores.size(); x++) {
            if (listaJugadores.get(x).getPuntaje() > listaJugadores.get(x++).getPuntaje()) {
                System.out.println("El ganador es: " + listaJugadores.get(x).getNombre());
            } else {
                System.out.println("El ganador es: " + listaJugadores.get(x++).getNombre());
            }

        }
    }

}