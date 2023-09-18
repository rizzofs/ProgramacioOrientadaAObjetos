package src.TP1.Ej11_Juego;

public class Jugador {
    private String usuario;
    private int puntaje;

    public Jugador(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre(){
        return this.usuario;
    }

    public int getPuntaje(){
        return this.puntaje;
    }

    public void setPuntaje(int puntaje){
        this.puntaje= puntaje;
    }


}
