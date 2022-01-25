import java.util.InputMismatchException;
import java.util.Scanner;

public class repasoarray {

	public static void main(String[] args) {
		char []miarray=new char [26];
			rellenaMInus(miarray);
			pidePosition(miarray);
			
	}
	
	
	
	
	
	//rellenar un array char con 26 letras minus
	public static void rellenaMInus(char[]miarray) {
		for (int i=97, j=0 ; i<=122; i++, j++) {
			miarray[j]=(char)i;
			
		}
	}
	
	
	
	//hacer un bucle que termine cuando la respuesta a "desea contunuar" sea N 
	/*pedir una posicion correcta dentro del array
	 * 
	 * comcatenar en un strig el caracter correspondiente a la posición
	 */
	
	
	public static void pidePosition( char miarray[]) {
		Scanner teclado=new Scanner(System.in);
	 int p=-1;
	 char continua='S';
	 String cadena="";
	 boolean h=false;
	 do{
		System.out.println("intruduce un numero");
		p=teclado.nextInt();
	    try {
			p=validaRango("Introduce posicion");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}		
		cadena+=miarray[p];
		System.out.println("¿desea continuar? S:si N:no");
		continua=teclado.next().charAt(0);
		if(continua=='S'){
			h=true;
		}else if(continua=='N'){
			h=false;
		}
	}while(!h);
	 System.out.println(cadena);
	}

	
	
	
	
	public static int leeEntero (String f) {
			Scanner teclado=new Scanner(System.in);
				int numero=-1;
				boolean valid=false;
				do {
					try {
						System.out.println(f);
						numero=teclado.nextInt();
								valid= true;
						}catch(InputMismatchException ex) {
							System.out.println("numero entero no valido");
							teclado.nextInt();
						}
				}while(!valid);
				return numero;
			
			
	}
	
	public static int validaRango(String f) throws Exception{
		int valor=-1;
		valor=leeEntero(f);
		if (valor<0 || valor>25 ) {
			throw new Exception ("posicion fuerea del rango del array");
		}
		return valor;
	}
	
	
	
	
	
}
