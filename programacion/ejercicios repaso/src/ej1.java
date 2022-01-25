import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce el año alctual");
		int año=teclado.nextInt();
		System.out.println("introduce el año de nacimiento");
		int añoN=teclado.nextInt();
		int edad;
		edad=año-añoN;	
		System.out.println(edad);
	}
}
