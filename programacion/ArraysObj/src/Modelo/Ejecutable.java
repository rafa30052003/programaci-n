package Modelo;

public class Ejecutable {

	public static void main(String[] args) {
		
		Parking p = new Parking ("La Victoria",3);
		
		System.out.println(p);
		
		Coche c=new Coche("1111-CCC","Ana");
		p.newCoche(c);
		
		c=new Coche("2222-CCC","Pedro");
		p.newCoche(c);
		
		c=new Coche("1111-CCC","Ana");
		p.newCoche(c);
		
		c=new Coche("3333-CCC","Maria");
		p.newCoche(c);
		
		c=new Coche("3658-CCC","Luis");
		p.newCoche(c);
		
		System.out.println(p);
		
		Coche eliminado=p.sacaCoche("1112-CCC");
		if(eliminado ==null) {
			System.out.println("el coche no está en el parking");
		}else {
			System.out.println("Se ha eliminado el coche "+ eliminado);	
		}
		
		System.out.println(p);
		
	}

}
