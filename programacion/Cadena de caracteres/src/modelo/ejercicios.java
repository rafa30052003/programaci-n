package modelo;

import java.util.Scanner;

public class ejercicios {

	public static void main(String[] args) {
		Scanner e= new Scanner (System.in);
		System.out.println("introduce una frase");
		String frase= e.nextLine();
		 frase=frase.replace(" ", "");
		 frase=frase.replace(",", "");
		 frase=frase.replace(".", "");
		 int fin=frase.length()-1;
		 int ini=0;
		 boolean espalin=true;
		 
		 while(ini<fin) {
			 if(frase.charAt(ini)!=frase.charAt(fin)) {
				 espalin=false;
			 }
			 
		ini++;
		fin--;
		 }
		 if(espalin) {
			 System.out.println("\nEs palindromo.");
			 
		 }else {
			 System.out.println("\nNo es palindromo.");
		 }
	}
	
}
