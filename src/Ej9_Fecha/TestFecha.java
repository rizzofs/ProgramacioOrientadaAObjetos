package src.Ej9_Fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestFecha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha que desea ");
        String fecha = sc.next();
        Fecha fechaCargada= new Fecha(fecha);
        System.out.println("La fecha cargada es " + fechaCargada.getFecha());
        System.out.println("Ingrese la fecha que desea ");
        String fecha2 = sc.next();
        Fecha fechaCargada2= new Fecha(fecha2);
        System.out.println("Ingrese la fecha que desea ");
        String fecha3 = sc.next();
        Fecha fechaCargada3= new Fecha(fecha3);
        fechaCargada.entreFechas(fechaCargada2, fechaCargada3);
        fechaCargada.esMayor(fechaCargada3);
        fechaCargada.esMenor(fechaCargada2);

    }
}
