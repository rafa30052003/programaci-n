import java.util.InputMismatchException;
import java.util.Scanner;

public class ej5array {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("pon el tamaño del array");
		int c=4;
		
		int[]a=new int[c];
		rellenaAleatorio(a);
		System.out.println("la suma del array es"+SumaArray(a));

	}

	public static int SumaArray(int[]a) {
		int suma=-1;
		
		for (int i = 0; i < a.length; i++) {
			suma+=a[i];
		}
		
		return suma;
	}
	
	
	
	
	
	
	
	public static void rellenaAleatorio(int[]a) {
		for (int i = 0; i < a.length; i++) {
			a[i]=generaAleatorio(0,9);
		}
	}
	
	public static int generaAleatorio(int upper, int lower) {
		int valor=0;
		int aux=0;
		if(lower>upper){
			aux=lower;
			lower=upper;
			upper=aux;
		}
		valor=(int) (Math.random()*(upper-lower))+lower;
		return valor;
	}

	
	
	
	
	public static int LeeEntero(String f) {
		Scanner t=new Scanner(System.in);
		int numero=-1;
		boolean valid=false;
		do {
			try {
				System.out.println(f);
				numero=t.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println(" numero  entero no valido");
				t.nextInt();
			}
			
		}while(!valid);
		return numero;
	}
}
