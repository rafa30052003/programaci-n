package modelo;

public class PruebaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEnlazada lista = new ListaEnlazada();
		lista.addFirst("hola");
		lista.addLast("adios");
		lista.addLast("Buenas Noches");
		
		for(int i=0;i<lista.lengthList();i++) {
			System.out.println(lista.getDato(i));
		}
		
		
	}

}
