import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce el a�o alctual");
		int a�o=teclado.nextInt();
		System.out.println("introduce el a�o de nacimiento");
		int a�oN=teclado.nextInt();
		int edad;
		edad=a�o-a�oN;	
		System.out.println(edad);
	}
}
