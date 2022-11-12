package modelo;

public class Nodo<T> {

    private T dato;
    private Nodo<T> siguiente;

    /**
     * Constructor por defecto. Inicializa el nodo.
     */
    public Nodo() {
        this.siguiente = null;
    }

    /**
     * Se le pasa un dato al nodo.
     *
     * @param t dato que se recibe
     */
    public Nodo(T t) {
        this.siguiente = null;
        this.dato = t;
    }

    /**
     * Se le pasa un dato y un siguiente nodo al nodo.
     *
     * @param t Dato a insertar
     * @param siguiente Su siguiente nodo
     */
    public Nodo(T t, Nodo<T> siguiente) {
        this.siguiente = siguiente;
        this.dato = t;
    }

    //Getters and Setters
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    //End Getters and Setters
}
