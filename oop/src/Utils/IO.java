package Utils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class IO {
	public static String leeFrase() {
		Scanner teclado=new Scanner(System.in);
		String frase=teclado.next();
		return frase;
	}
	
	public static int leeEntero() throws InputMismatchException,NoSuchElementException,IllegalStateException  {
		Scanner teclado=new Scanner(System.in);
		int valor=0;
		valor=teclado.nextInt();
		return valor;
	}
}
