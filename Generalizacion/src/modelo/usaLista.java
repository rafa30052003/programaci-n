package modelo;

public class usaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lista nombres = new lista (4);
		nombres.add("Maria");
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add(new Empleado("Ana","progr",52,1500));
		String nom= (String)nombres.get(3);
		System.out.println(nom);
	}

}
