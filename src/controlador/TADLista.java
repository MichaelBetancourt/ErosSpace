package controlador;

import modelo.Nodo;

public class TADLista<T> {

    //Atributos
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamanio;

    /**
     * Constructor por defecto.
     */
    public TADLista() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    /**
     * Indica si esta la lista vacia o no
     *
     * @return
     */
    public boolean isEmpty() {
        return tamanio == 0;
    }

    /**
     * Devuelve el tamaño de la lista
     *
     * @return
     */
    public int size() {
        return tamanio;
    }

    /**
     * Añade el elemento al principio de la lista.
     *
     * @param elemento el dato que se va a add
     * @return elemento añadido
     */
    public T addFirst(T elemento) {
        Nodo<T> aux;
        //si esta vacia, el nodo será el primero y ultimo
        if (isEmpty()) {
            aux = new Nodo<>(elemento, null);
            primero = aux;
            ultimo = aux;
        } else {
            //Hago el intercambio
            Nodo<T> primeroActual = primero;
            aux = new Nodo<>(elemento, primeroActual);
            primero = aux;
        }
        tamanio++;
        return primero.getDato();
    }

    /**
     * Añade un elemento al final de la lista. Si está vacía, se agrega el
     * elemento al comienzo de la misma para así, crearla.
     *
     * @param elemento el dato que se va a add
     * @return elemento añadido
     */
    public T addLast(T elemento) {
        Nodo<T> aux;
        if (isEmpty()) {
            return addFirst(elemento);
        } else {
            //Hago el intercambio
            aux = new Nodo<>(elemento, null);
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }
        tamanio++;
        return ultimo.getDato();
    }

    /**
     * Añade un elemento en una posicion indicada.
     *
     * @param elemento el dato que se va a agregar
     * @param index índice en el que se va a agregar el dato. Debe ser un indice
     * válido.
     * @return elemento añadido. Si la lista está vacía o el índice no es
     * correcto, retorna un valor nulo.
     */
    public T add(T elemento, int index) {
        //si esta vacio o el indice no es correcto, devuelve null
        if (index == 0) {
            return addFirst(elemento); //Añade en la primera posicion
        } else if (index == size()) {
            return addLast(elemento); //añade en la ultima posicion
        } else if (index < 0 || index >= size()) {
            return null;
        } else {

            //Cojo el anterior nodo al que estoy buscando
            Nodo<T> buscado_anterior = getNode(index - 1);

            //Cojo el nodo de la posicion indicada
            Nodo<T> buscado_actual = getNode(index);

            //Creo el nuevo nodo, este apuntara al de la posicion actual
            Nodo<T> aux = new Nodo<>(elemento, buscado_actual);

            //el nodo anterior apunta a nuestro nuevo nodo
            buscado_anterior.setSiguiente(aux);

            tamanio++;
            return getNode(index).getDato();

        }
    }

    /**
     * Método para obtener un nodo de la lista. Si está vacío o el índice no es
     * correcto, devuelve un valor nulo.
     *
     * @param index recibe el índice especificado
     * @return el nodo completo de una posicion especificada
     */
    private Nodo<T> getNode(int index) {
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return primero;
        } else if (index == size() - 1) {
            return ultimo;
        } else {
            Nodo<T> buscado = primero;
            int contador = 0;
            while (contador < index) {
                contador++;
                buscado = buscado.getSiguiente();
            }
            return buscado;
        }
    }

    /**
     * Método para obtener un nodo de la lista. Si está vacío o el índice no es
     * correcto, devuelve un valor nulo.
     *
     * @param index recibe el índice especificado
     * @return el nodo completo de una posicion especificada
     */
    public T get(int index) {
        Nodo<T> buscado = getNode(index);
        return buscado.getDato();
    }

    /**
     * Indica la posición del elemento especificado.
     *
     * @param elemento
     * @return
     */
    public int indexOf(T elemento) {
        if (!isEmpty()) {
            Nodo<T> aux = primero;
            int posicion = 0;
            while (aux != null) {
                if (elemento.equals(aux.getDato())) {
                    return posicion;
                }
                posicion++;
                aux = aux.getSiguiente();
            }
        }
        return -1;
    }

    /**
     * Elimina el primer elemento de la lista.
     *
     * @return el elemento eliminado. Nulo si la lista está vacía.
     */
    public T removeFirst() {
        if (!isEmpty()) {
            T elemento = primero.getDato();
            //Tomo el segundo
            Nodo<T> aux = primero.getSiguiente();
            primero = null; //Lo marco como null para el recolector
            primero = aux; //Nuevo primero
            if (size() == 1) {
                ultimo = null;
            }
            tamanio--;
            return elemento;
        }
        return null;
    }

    /**
     * Elimina el último elemento de la lista.
     *
     * @return el elemento eliminado. Nulo si la lista está vacía.
     */
    public T removeLast() {
        if (!isEmpty()) {
            //Coge el elemento antes de borrar
            T elemento = ultimo.getDato();
            //Cojo el penultimo
            Nodo<T> aux = getNode(size() - 2);

            //En caso de que sea null
            //Hay 1 o dos elementos
            if (aux == null) {
                //marco el ultimo como nulo
                ultimo = null;
                //Si hay dos, el primero y el ultimo seran el mismo
                //Si hay 1 elemento, significa que borramos la lista
                if (size() == 2) {
                    ultimo = primero;
                } else {
                    primero = null;
                }
            } else {
                //el penultimo es el nuevo ultimo 
                //y le ponemos como siguiente nulo
                ultimo = null;
                ultimo = aux;
                ultimo.setSiguiente(null);
            }
            tamanio--;
            return elemento;
        }
        return null;
    }

    /**
     * Elimina el nodo de la lista en la posicion especificada.
     *
     * @param index índice que se va a elminiar
     * @return el elemento eliminado. Nulo si la lista está vacía.
     */
    public T remove(int index) {
        if (isEmpty() || (index < 0 || index >= size())) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size() - 1) {
            return removeLast();
        } else {

            //Cojo el nodo anterior al que quiero borrar
            Nodo<T> nodo_anterior = getNode(index - 1);

            //Cojo el nodo que quiero borrar
            Nodo<T> nodo_actual = getNode(index);

            //Cojo el elemento antes de borrar
            T elemento = nodo_actual.getDato();

            //Cojo el nodo siguiente al que quiero borrar
            Nodo<T> nodo_siguiente = nodo_actual.getSiguiente();

            //El nodo anterior apunta al nodo siguiente
            nodo_anterior.setSiguiente(nodo_siguiente);

            tamanio--;
            return elemento;

        }
    }

    /**
     * Modifico el elemento de una posicion especificada. Esto no afecta a la
     * estructura de la lista.
     *
     * @param elemento el elemento que se desea modificar
     * @param index el índice donde se encuentra el elemento
     * @return el elemento modificado. Nulo si está vacía
     */
    public T modify(T elemento, int index) {
        if (!(isEmpty() || (index < 0 || index >= size()))) {
            Nodo<T> aux = getNode(index);
            aux.setDato(elemento);
            return aux.getDato();
        }
        return null;
    }

    /**
     * Devuelve el estado o resumen de la lista. Se recorre la lista y los datos
     * se van almacenando en un contador.
     *
     * @return contador que almacena la lista.
     */
    public String print() {
        String contenido = "";
        if (!isEmpty()) {
            Nodo<T> aux = primero;
            while (aux != null) {
                contenido += aux.getDato().toString();
                aux = aux.getSiguiente();
            }
        } else {
            contenido = "Lista vacia";
        }
        return contenido;
    }

}
