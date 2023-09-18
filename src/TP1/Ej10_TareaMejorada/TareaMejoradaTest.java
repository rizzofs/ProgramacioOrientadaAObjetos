package src.TP1.Ej10_TareaMejorada;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class TareaMejoradaTest {


    @Test
    void cambiarPrioridad() {
        TareaMejorada tarea = new TareaMejorada("Ir al super", TareaMejorada.Prioridad.NO_URGENTE, false, LocalDate.now().plusDays(5),LocalDate.now().plusDays(0) );
        tarea.cambiarPrioridad();
        System.out.println(tarea.obtener_prioridad());
    }

    @Test
    void mostrar() {
        TareaMejorada tarea = new TareaMejorada("Ir al super", TareaMejorada.Prioridad.NO_URGENTE, false, LocalDate.now().plusDays(5),LocalDate.now().plusDays(0) );
        System.out.println(tarea.mostrar());
    }

}