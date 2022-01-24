package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class utils {
	/**
	 * Funci�n que rellena un array con valores pedidos por teclado
	 * @param miArray: array donde se almacenan los valores pedidos
	 */
	
	public static void rellenaArray(int [] ArraUsu) {
		for(int i=0;i<ArraUsu.length;i++) {
		    try {
				ArraUsu[i]=pideValor(i);
			} catch (Exception e) {
				i--;
				System.out.println(e);
			}
		}
	}
	/**
	 * metodo que pide un valor entero entre 1 y 5,
	 * cuando el numero introducido no esta entre 1 y 5, lanza excepcion
	 * @param i: tendr� la posici�n del elemento dentro del array, servir� para informar al usuario unicamente
	 * @return valor entero
	 * @throws Exception: lanzar� la excepcion cuando el numero sea 0 o menos que 0
	 */
	public static int pideValor(int i) throws Exception {
		int valor=-1;
		valor=leeEntero("introduce numero para posici�n "+ i +" :");
		if(valor<1 || valor>5) {
			throw new Exception("Error, el numero debe ser entre 1 y 5");
		}
		return valor;
	}
	/**
	 * lee un entero por teclado y valide el dato
	 * @param f :cadena para mostrar mensaje
	 * @return un entero con el valor recibido
	 */
	public static int leeEntero(String f) {
		Scanner teclado = new Scanner (System.in);
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
	kmak
}
