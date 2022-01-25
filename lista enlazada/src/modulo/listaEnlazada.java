package modulo;

public class listaEnlazada<T> {
	//atributos 
	private nodo<T> primero;
	
	
	public listaEnlazada() {
		this.primero=null;
	}
	
	public void addFirst(T dato) {
		nodo<T> nuevo= new nodo<>(dato);
		
		nuevo.setSiguiente(this.primero);
		this.primero=nuevo;
	}
	public void addLast(T dato) {
		nodo<T>	ultimo=new nodo<>(dato);
		if(this.isEmpty()) {
			this.addFirst(dato);
		}else {
			nodo<T> aux=this.primero;
			while(aux.getSiguiente()!=null){
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(ultimo);
		}
		
		
	}
	
	public boolean isEmpty() {
		 return primero==null;
	}
	
	/**
	 * devuelve el primer elemento de la lista
	 * @return dato del primer elemento o null si la lista esta vacia
	 */
	public T getfirst(){
		T elemento= null;
		if(this.isEmpty()) {
			elemento=this.primero.getDato();
		}
		return elemento;
	}
	public T getDato(int pos){
		T elemento= null;
		nodo  <T> aux= this.primero;
		int cont=0;
		if(pos>0 && pos<=this.lenght()) {
			while(aux!=null) {
				if(pos == cont) {
					elemento=aux.getDato();
					
				}
				cont++;
				aux=aux.getSiguiente();
			}
		}
		return elemento;
	}
	public int lenght() {
		nodo <T> aux;
		int nElem=-1;
		aux=primero;
		
		while(aux!=null) {
			aux= aux.getSiguiente();
		}
		return nElem;
		
		
	}
}
