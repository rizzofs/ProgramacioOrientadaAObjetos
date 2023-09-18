package src.TP1;

public class Lista<T> {

    public class Nodo {
        T valor;
        Nodo siguiente;

        public Nodo(T valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }
}
