package src;

public class Cola <T> {
    public class Nodo {
        private T valor;
        Nodo siguiente;

        public Nodo(T valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }
    private Nodo frente_cola;
    private Nodo final_cola;

    private int longitud;

    public Cola() {
        frente_cola = null;
        final_cola = null;
        longitud = 0;
    }

    public boolean cola_es_vacia() {
        return frente_cola == null;
    }

    public int longitud_cola(){ return longitud;}

    public void encolar(T valor){
        Nodo nuevoNodo = new Nodo(valor);
        if(frente_cola==null){
            frente_cola=nuevoNodo;
        }
        else{
            Nodo actual = frente_cola;
            while(actual.siguiente != null){
                actual.siguiente = actual;
            }
            actual.siguiente =frente_cola;
        }
        longitud++;
    }

    public T desencolar(){
        if(frente_cola == null){
            throw new IndexOutOfBoundsException("No hay elementos para desencolar");
        }
        T valorFrente = frente_cola.valor;
        frente_cola = frente_cola.siguiente;
        longitud--;
        return valorFrente;

    }
}
