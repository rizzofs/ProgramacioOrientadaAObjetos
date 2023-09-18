package src.TP1.Ej8_Contrasenia;

import java.util.Scanner;

public class Contrasenia {
    private final int LONGITUD=8;
    private int longitud;
    private String contrasena;

    public Contrasenia(){
        this.longitud=LONGITUD;
        this.contrasena=generarContrasena();
    }

    public Contrasenia(int longitud) {
        this.longitud=longitud;
        this.contrasena=generarContrasena();
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getLongitud(){return longitud; }

    public void mostrarContrasena() {
        Scanner sc = new Scanner(System.in);
        System.out.print("<" + getContrasena() + ">");
        if (this.isFuerte()) {
            System.out.println(" - Fuerte");
        } else
            {System.out.println(" - Debil");
            System.out.println("¿Desea regenerar Password? s-SI n-NO");
            String op = sc.next();
            if (op.equals("s")) {
                this.regenerarContrasenia();
                }
            }
        ;
    }

    public String generarContrasena (){
        String contrasena="";
        for (int i=0;i<longitud;i++){
            int alAzar=((int)Math.floor(Math.random()*3+1));

            if (alAzar==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                contrasena+=minusculas;
            }else{
                if(alAzar==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    contrasena+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    contrasena+=numeros;
                }
            }
        }
        return contrasena;
    }

    public boolean isFuerte(){
        int contNumeros=0;
        int contMinusculas=0;
        int contMayusculas=0;
        for (int i=0;i<contrasena.length();i++){
            if (contrasena.charAt(i)>=97 && contrasena.charAt(i)<=122){
                contMinusculas+=1;
            }else{
                if (contrasena.charAt(i)>=65 && contrasena.charAt(i)<=90){
                    contMayusculas+=1;
                }else{
                    contNumeros+=1;
                }
            }
        }
        if (contMinusculas>1 &&  contNumeros>=2 && contMayusculas>2){
            return true;
        }else{
            return false;
        }
    }

    public void regenerarContrasenia(){
        this.contrasena= generarContrasena();
        System.out.println("La nueva password es: " );
        this.mostrarContrasena();
        }
    }

