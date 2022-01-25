package modulo;

public class nodo<T> {
	private T dato;// almacena los datos del objeto de tipo generico
	private nodo<T> siguiente;//apuntsdor al siguiente nodo
	
	//constructor por defecto
	private nodo() {
		this.siguiente=null;
	}
	/**
	 * Constructor que recibe el dato pero no sabemos el siguiente
	 * @param dato
	 */
	public nodo(T dato ) {
		this.dato= dato;
		this.siguiente=null;
	}
	/**
	 * Contructor que recive el dato y el sigue¡iente nodo al que tiene que apuntar
	 * @param dato que se almacena en el nodo
	 * @param siguente nodo al que apunta el actual.
	 */
	public nodo(T dato, nodo<T> siguente) {
		this.dato=dato;
		this.siguiente=siguiente;
	}
	
	
	
	public T getDato() {
		return dato;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}
	public nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
}
