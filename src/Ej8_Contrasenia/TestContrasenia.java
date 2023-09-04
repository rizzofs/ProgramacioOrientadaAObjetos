package src.Ej8_Contrasenia;

import java.util.Scanner;

public class TestContrasenia {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("¿Que tarea desea realizar?\n 0-Finalizar.\n 1-Generar contraseña con longitud determinada. \n 2-Generar contraseña con longitud por defecto.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> getPassword();
                case 2 -> getPasswordDefault();
            }
        } while (opcion != 0);
    }

    public static void getPassword() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ingrese la longitud que desea para su Password");
        int longitud = sc1.nextInt();
        Contrasenia password1 = new Contrasenia(longitud);
        password1.mostrarContrasena();
    }

    public static void getPasswordDefault(){
        Contrasenia password2 = new Contrasenia();
        password2.mostrarContrasena();
    }


}
