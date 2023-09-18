package src.TP1.Ej7_raices;

public class Raiz {
    private double a;
    private double b;
    private double c;

    public Raiz(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    private double getDiscriminante() {
        return ((b*b)-(4*a*c));
    }

    private void obtenerRaices() {
        double resultado1= (-b+(Math.sqrt(getDiscriminante()))/(2*a));
        double resultado2= (-b-(Math.sqrt(getDiscriminante()))/(2*a));
        System.out.println("La raiz 1 es " + resultado1);
        System.out.println("La raiz 2 es " + resultado2);
        calcularY(resultado1);
        calcularY(resultado2);
    }

    private void obtenerRaiz(){
        double raiz=(-b)/(2*a);
        System.out.println("La ecuacion tiene una unica solucion");
        System.out.println(raiz);
        calcularY(raiz);
    }

    private boolean tieneRaices(){
        return getDiscriminante()>0;
    }

    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }

    public void calcular(){
        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("La ecuacion no tiene soluciones");
        }
    }

    public void calcularY(double x){
        double y=a * (x*x) + (b*x) + c;
        System.out.println("Cuando x = " + x+ " la funcion y es = ");
        System.out.println(y);
    }
}

