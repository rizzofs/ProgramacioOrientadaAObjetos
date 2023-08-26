import java.time.LocalDate;

public class TestTarea {
    public static void main(String[] args) {
        tp1_5.Tarea tarea = new tp1_5().new Tarea("Ir al supermercado", tp1_5.Prioridad.PENDIENTE, false, LocalDate.now().plusDays(1));

        System.out.println("Descripción de la tarea: " + tarea.mostrar());

        tarea.crear_descripcion("Ir al supermercado mañana");
        System.out.println("Nueva descripción de la tarea: " + tarea.mostrar());

        tarea.asignar_prioridad(tp1_5.Prioridad.EN_PROCESO);
        System.out.println("Prioridad de la tarea: " + tarea.obtener_prioridad());
        ;

        tarea.fecha_limite(LocalDate.now().plusDays(1));
        System.out.println("Fecha límite de la tarea: " + tarea.obtener_fecha());


        tarea.Esta_finalizada(false);
        System.out.println("¿La tarea está completa? " + tarea.esCompleta());

        System.out.println("¿La tarea está vencida? " + tarea.esta_vencida());

        tp1_5.Tarea tarea2 = new tp1_5().new Tarea("Consultar repuesto del auto", tp1_5.Prioridad.PENDIENTE, true, LocalDate.now().plusDays(-1));
        System.out.println("Descripción de la tarea: " + tarea2.mostrar());
        System.out.println("Prioridad de la tarea: " + tarea2.obtener_prioridad());
        System.out.println("Fecha límite de la tarea: " + tarea2.obtener_fecha());
        System.out.println("¿La tarea está completa? " + tarea2.esCompleta());
        System.out.println("¿La tarea está vencida? " + tarea2.esta_vencida());

        tp1_5.Tarea tarea3 = new tp1_5().new Tarea("Ir al cine a ver la nueva película de Marvel", tp1_5.Prioridad.PENDIENTE, false, LocalDate.now().plusDays(-1));
        System.out.println("Descripción de la tarea: " + tarea3.mostrar());
        System.out.println("Prioridad de la tarea: " + tarea3.obtener_prioridad());
        System.out.println("Fecha límite de la tarea: " + tarea3.obtener_fecha());
        System.out.println("¿La tarea está completa? " + tarea3.esCompleta());
        System.out.println("¿La tarea está vencida? " + tarea3.esta_vencida());


    }
}

