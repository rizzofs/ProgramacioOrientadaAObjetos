package src.Ej11_Juego;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {



    @Test
    void agregarPalabraValida() {
        Juego juego= new Juego();
        ArrayList<String> diccionario =new ArrayList<>();
        juego.agregarPalabraValida();
    }

    @Test
    void validarPalabra() {
       // juego.validarPalabra("mesa");
    }

    @Test
    void ingresarPalabra() {
        //juego.ingresarPalabra();

    }

    @Test
    void calcularPuntaje() {
    }

    @Test
    void cargarPuntosJugador() {
    }

    @Test
    void evaluarGanador() {
    }
}