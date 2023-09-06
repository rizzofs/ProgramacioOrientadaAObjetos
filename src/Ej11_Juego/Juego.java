package src.Ej11_Juego;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private ArrayList<Jugador> listaJugadores;
    private int puntaje;
    private ArrayList<String> diccionario;

    public Juego() {
        listaJugadores.add(new Jugador(usuario1));
        listaJugadores.add(new Jugador(usuario2));
    }

    public void ingresarPalabra(){
        ArrayList<String> palabrasJ1 = null;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++){
            System.out.println("Ingrese la palabra " + i);
            String palabra = sc.next();
            palabrasJ1.add(palabra);
        }
    }

    private void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int calcularPuntaje(ArrayList<String> palabrasJ1){
        int puntaje = 0;
        for (int i = 0; i < palabrasJ1.size();i++){
            String palabraAEvaluar = palabrasJ1.get(i);
            for (int j = 0; j < palabraAEvaluar.length(); j++){
                if (palabraAEvaluar.charAt(j) == 'k'){
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'z'){
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'x'){
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'y'){
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'w'){
                    puntaje++;
                }
                if (palabraAEvaluar.charAt(j) == 'q'){
                    puntaje++;
                }
            }
            puntaje += palabraAEvaluar.length();
            setPuntaje(puntaje);
        }
        return puntaje;
    }
}