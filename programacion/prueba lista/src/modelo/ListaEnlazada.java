package modelo;

public class ListaEnlazada<T> {
	//atributos
	private Nodo<T> primero;
	
	public ListaEnlazada() {
		this.primero=null;
	}
	
	public boolean isEmpty() {
		return primero==null;
	}
	
    
	
	public Nodo<T> getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}

	/**
	 * Inserta un objeto al principio de la lista
	 * @param dato: Dato insertado
	 */
	public void addFirst(T dato) {
		//1. Creamos el nuevo nodo
		Nodo<T> nuevo= new Nodo<>(dato);
		//2. Hacemos que el siguiente del nuevo, apunte al primero
		nuevo.setSiguiente(this.primero);
		//3. Hacemos que el primero apunte al nuevo elemento
		//   as� lo metemos en la lista
		this.primero=nuevo;
		
	}
	
	
	/**
	 * Inserta un objeto al final de la lista
	 * @param dato: Dato insertado
	 */
	public void addLast(T dato) {
		
		// si no hay elementos en la lista, uso el m�todo a�adir
		// por el principio
		if (this.isEmpty()) {
			this.addFirst(dato);
		}else {//si hay elementos en la lista:
			//1. Creamos el nuevo nodo
			Nodo<T> nuevo= new Nodo<>(dato);
			//2. recorremos la lista para encontrar el ultimo elemento
			Nodo<T> aux = this.primero;
			while (aux.getSiguiente()!=null) {
				aux=aux.getSiguiente();
			}
			//3. Asigno al siguiente del ultimo elemento(aux)
			// el nuevo
			aux.setSiguiente(nuevo);
		}
	}
	
	/**
	 * Devuelve el primer elemento de la lista
	 * @return dato del primer elemento o null si la lista est� vacia.
	 */
	public T getFirst() {
		T elemento = null;
		if (!this.isEmpty()) {
			elemento=this.primero.getDato();
		}
		return elemento;
		
	}
	
	/**
	 * M�todo que cuenta los elementos de la lista.
	 * @return el n�mero de elementos de la lista
	 */
	public int lengthList() {
		Nodo <T> aux;
		int nElem=0;
		aux=primero;
		while(aux != null){
	        nElem++;
	        aux = aux.getSiguiente();
	    }
	        return nElem;
		
	}
	
	/**
	 * M�todo que busca un elemento dada una posici�n y devuelve su dato
	 * @param pos posici�n del elemento buscado
	 * @return el dato almacenado en la posici�n pos
	 */
	public T getDato(int pos) {
		T elemento = null;
		Nodo <T> aux = this.primero;
		int cont=0;
		
		
		
		if((pos>=0) && pos<=this.lengthList()) {
			while (aux!=null) {
				if(pos == cont) {
					elemento=aux.getDato();
				}
				cont++;
				aux=aux.getSiguiente();
			}
		}
		return elemento;
	}
	
	/**
	 * M�todo que busca un elemento dada una posici�n y devuelve el nodo
	 * @param pos posici�n del elemento buscado
	 * @return el nodo almacenado en la posici�n pos
	 */
	
	public Nodo<T> getNodo(int pos) {
		Nodo<T> elemento = null;
		Nodo <T> aux = this.primero;
		int cont=0;
		if((pos>=0) && pos<=this.lengthList()) {
			while (aux!=null) {
				if(pos == cont) {
					elemento=aux;
					aux=null;
				}
				cont++;
				aux=aux.getSiguiente();
			}
		}
		return elemento;
	}
	
	
	
	/**
	 *M�todo que elimine de la lista el primer nodo
	 *@return el nodo eliminado o null si la lista est� vac�a
	 */
	public Nodo<T> deletFirst() {
		Nodo<T> eliminado= this.primero;
		
		if(this.isEmpty()) {
			this.primero=primero.getSiguiente();
		}
		
		
		return eliminado;
	}
	
		
	/**
	 *M�todo que elimine de la lista el �ltimo nodo
	 *@return el nodo eliminado o null si la lista est� vac�a
	 */
	public Nodo<T> deletLast(){
		
		Nodo<T>eliminado=primero;
		if(this.isEmpty()) {
			//la lista tiene un solo elemento
			if(this.primero.getSiguiente()==null) {
				this.primero=null;
			}
		
		}else {//la lista tiene varios elementos
			eliminado=this.primero.getSiguiente();
			Nodo<T>ant=this.primero;
			while(eliminado.getSiguiente()!=null) {
				ant=eliminado;
				eliminado=eliminado.getSiguiente();
			}
			ant.setSiguiente(null);
		}
		
		return eliminado;
	}	
	
		
	/**
	 *M�todo que elimine de la lista el nodo indicado en una posici�n
	 *@param pos: posici�n del elemento a eliminar de la lista
	 *@return el nodo eliminado o null si la lista est� vac�a
	 */
		
	public Nodo<T> deletNodoIndic(int pos) {
		Nodo<T> elemento = null;
		Nodo <T> aux = this.primero;
		int cont=0;
		if(this.isEmpty() && this.lengthList()>pos) {
			if(pos==0) {
				aux=this.deletFirst();
			}else {
				while(cont!=pos) {
				elemento=aux;
				aux=aux.getSiguiente();
				cont++;
				}
				elemento.setSiguiente(aux.getSiguiente());
				aux.setSiguiente(null);
			}
		}
		return aux;
	}
		
	/**
	 * M�todo que modifique el dato del nodo de la posici�n dada
	 * @param int pos: posici�n del nodo a modificar
	 * @param T dato: nuevo dato
	 * @return boolean result: true si ha podido modificar el dato; false si no ha podido modificarlo
	 */
		public boolean modifDato(int pos, T dato){
			boolean result=false;
			if(this.isEmpty() && (pos>=0 &&s this.lengthList()>pos))
				while() {
					
				}
			return result;
		}
		
}
