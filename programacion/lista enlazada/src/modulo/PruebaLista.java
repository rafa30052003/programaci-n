package modulo;

public class PruebaLista {
	public static void main(String[] args) {
		listaEnlazada kista=new listaEnlazada();
		kista.addFirst("hola");
		kista.addLast("adios");
		kista.addLast("buenas noches");
		
		for (int i = 0; i < kista.lenght(); i++) {
			System.out.println(kista.getDato(i));
		}
	}
}
