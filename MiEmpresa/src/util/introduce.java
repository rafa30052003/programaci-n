package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class introduce {

	
	
	
	
	
	/**
	 * lee un entero por teclado y valide el dato
	 * @param f :cadena para mostrar mensaje
	 * @return un entero con el valor recibido
	 */
	public static int leeEntero(String f) {
		try (Scanner teclado = new Scanner (System.in)) {
			int numero=-1;
			boolean valid=false;//variable para terminar el bucle cuando el valor sea correcto
			do{
			   try{
			        System.out.println(f);
			        numero=teclado.nextInt();
			        valid=true;

			   }catch(InputMismatchException ex){
			        System.out.println("numero entero no valido");
			        teclado.next();
			        
			   }
			}while(!valid);
			return numero;
		}
	}
	
	
	
	
	
	
	
	
	
	/**
	 * metodo que pide un valor entero entre 1 y 5,
	 * cuando el numero introducido no esta entre 1 y 5, lanza excepcion
	 * @param i: tendrá la posición del elemento dentro del array, servirá para informar al usuario unicamente
	 * @return valor entero
	 * @throws Exception: lanzará la excepcion cuando el numero sea 0 o menos que 0
	 */
	public static int pideValor(int i) throws Exception {
		int valor=-1;
		valor=leeEntero("introduce numero para posición "+ i +" :");
		if(valor<1 || valor>5) {
			throw new Exception("Error, el numero debe ser entre 1 y 5");
		}
		return valor;
	}
	
}
