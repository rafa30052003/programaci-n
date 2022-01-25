package pruevaArrive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejPrueva {

	public static void main(String[] args, Object pistas) {
		Scanner e = new Scanner (System.in);
		int []codigo = new int[e.nextInt()];
		rellenaAleatorio(codigo);
		int []ArraUsu= new int[e.nextInt()];
		rellenaArray(ArraUsu);
		System.out.println("introduce numero de intentos");
		Scanner u = new Scanner (System.in);
		int intentos=u.nextInt();
		 do {
			if(codigo==ArraUsu) {
				System.out.println("has acertado");
			}else {
				
				pistas(codigo, ArraUsu);
			}
	
			 
		 }while(intentos>0 || !comparaArray(codigo,ArraUsu));
		
		
	}
	
	
	/**
	 * este metodo compara dos array para ver si son iguales.
	 * @param codigo
	 * @param ArraUsu
	 * @return si son iguales los array.
	 */
	
	public static boolean comparaArray(int []codigo, int []ArraUsu) {
		boolean iguales=true;
			if (codigo.length != ArraUsu.length){
					iguales=false;
			}else {	
				for(int i=0; i<codigo.length; i++) {
					if(codigo[i]!=ArraUsu[i]) {
						iguales=false;
						i=codigo.length;
					}
				}
			}
		return iguales;
	}
	
	
	
	/**
	 * rellena con numeros aleatorios entre 1 y 5 el array
	 * @param codigo
	 */
	public static void rellenaAleatorio(int[] codigo) {
		for (int i = 0; i <codigo.length; i++) {
			codigo[i]=generaAleatorio(1,5);
		}
	}
	
	
	
	
	
	/**
	 * metodo que genera un numero aleatorio entre dos límites
	 * @param upper limite superior
	 * @param lower limite inferior
	 * @return valor aleatorio comprendido entre los dos limites
	 */
	private static int generaAleatorio(int upper,int lower) {
		int valor=0;
		int aux=0;
		if(lower>upper) {
			aux=lower;
			lower=upper;
			upper=aux;
		}
		valor=(int) (Math.random() * (upper - lower)) + lower;
		//return (int) (Math.random() * (upper - lower)) + lower;
		return valor;
	}
	
	
	
	
	
	/**
	 * Función que rellena un array con valores pedidos por teclado
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
	
	
	
	
	public static void pistas(int []codigo, int []ArraUsu ) {
		for(int i=0;i<codigo.length;i++) {
		if(codigo.length==ArraUsu.length){
			System.out.println("es igual");
		}else if(codigo.length<ArraUsu.length){
			System.out.println("es menor");
		}else{
			System.out.println("es mayor");
			}
		}
	}
	
	
	
	
	
}

