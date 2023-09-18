package src.TP1;

public class Pila <T> {
    public class Nodo{
        T valor;
        Nodo siguiente;

        public Nodo(T valor){
            this.valor=valor;
            this.siguiente=null;
        }
    }
    private Nodo tope;
    private int longitud;

    public Pila(){
        tope=null;
        longitud = 0;
    }

    public boolean pila_es_vacia(){return tope == null;}

    public int longitud_pila(){return longitud;}

    public void apilar_elemento(T valor){
        Nodo nuevoNodo = new Nodo(valor);
        if(tope==null){
            tope=nuevoNodo;
        }
        else{
            Nodo actual = tope;
            while(actual.siguiente != null){
                actual.siguiente=actual;
            }
            actual.siguiente=tope;
        }
        longitud++;
    }

    public T desapilar_elemento(){
        if(tope==null){
            throw new IndexOutOfBoundsException("No hay elemento en el tope");
        }
        T nuevo_valor= tope.valor;
        tope=tope.siguiente;
        longitud--;
        return nuevo_valor;
    }
}
