package src.TP1.Ej9_Fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Fecha {

    private LocalDate tipoFecha;

    public Fecha(String fecha){
        this.tipoFecha= this.conventirFecha(fecha);

    }

    public LocalDate getFecha() {
        return tipoFecha;
    }

    private LocalDate conventirFecha(String fecha){
        LocalDate fechaParseada= null;
        try {
            DateTimeFormatter deStringtoFecha = DateTimeFormatter.ofPattern("MM-dd-yyyy");
            fechaParseada = LocalDate.parse(fecha, deStringtoFecha);}
        catch (DateTimeParseException e){
            try{
                DateTimeFormatter deStringtoFecha2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                fechaParseada = LocalDate.parse(fecha, deStringtoFecha2);}
            catch (DateTimeParseException e2){
                System.out.println("La cadena no coincide con los formatos permitidos");
            }
        }
        return fechaParseada;
    }

    public void entreFechas (Fecha f2, Fecha f3){
        if(this.getFecha().isAfter(f2.getFecha()) && this.getFecha().isBefore(f3.getFecha())){
            System.out.println("La fecha esta entre las fechas dadas");}
        else{
            System.out.println("La fecha NO está entre las fechas dadas");
        }
    }

    public void esMayor (Fecha f2){
        if(this.getFecha().isAfter(f2.getFecha())){
            System.out.println("La fecha es mayor que la fecha comparada");}
        else{
            System.out.println("La fecha NO es mayor que la fecha comparada");
        }
    }

    public void esMenor (Fecha f2){
        if(this.getFecha().isBefore(f2.getFecha())){
            System.out.println("La fecha es menor que la fecha comparada");}
        else{
            System.out.println("La fecha NO es menor que la fecha comparada");
        }
    }

}
