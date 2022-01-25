import java.util.InputMismatchException;
import java.util.Scanner;

public class ej1array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]miarray=new int[10];
		System.out.println("rellena el array");
		rellenaArray(miarray);
		for (int i =miarray.length-1 ; i >=0 ; i--) {
			System.out.println(miarray[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	public static void rellenaArray(int[]miarray) {
		for (int i = 0; i < miarray.length; i++) {
			
				miarray[i]=leeEntero("introduce un valor para la posicion"+i+":");
			
			
			}
			
		}
		
	
	
	
	
	public static int leeEntero(String f) {
		int n=-1;
		Scanner teclado= new Scanner(System.in);
		boolean valid= false;
		do {
			try {
				System.out.println(f);
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex ){
				System.out.println("numero entero no valido");
				teclado.next();
			}
		}while(!valid);
		return n;
	}
}
