import java.util.InputMismatchException;
import java.util.Scanner;

public class ej2array {

	public static void main(String[] args) {
		Scanner n=new Scanner (System.in);
	 int[]miarray=new int [10];
	 rellenaArray(miarray);
	 int n1=-1;
	 System.out.println("introduce un numero");
	 n1=n.nextInt();
	 boolean encontrado=false;
	 	for (int j = 0; j < miarray.length && !encontrado; j++) {
			
		
		if(n1==miarray[j]) {
			
	 		System.out.println(v+"esta en"+j);
	 		encontrado=true;
	 	}else if(n1!=miarray[j]) {
	 		System.out.println("no existe");
	 	}
	 }
	}
	public static void rellenaArray(int[]miarray){
		for (int i = 0; i < miarray.length; i++) {
			miarray[i]=leeEntero("introduce un valor para la posicion"+i+":");
		}
	}
	public static int leeEntero(String f) {
		Scanner teclado=new Scanner (System.in);
		int numero=-1;
		
		boolean valid=false;
		do {
			try {
				System.out.println(f);
				numero=teclado.nextInt();
				valid=true;
				
			}catch(InputMismatchException ex) {
				System.out.println("numero entero no valido");
				teclado.nextInt();
			}
			
		}while(!valid);
		
		
		return numero;	
	}
}
