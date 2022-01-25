package pruevaArrive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class array911 {

	public static void main(String[] args)  {
		int[]PrimerTri=new int[5];
		int[]SegundoTri= new int[5];
		int[]TercerTri=new int[5];
		rellenaArray(PrimerTri);
		rellenaArray(SegundoTri);
		rellenaArray(TercerTri);
		System.out.println("medida del trimestre 1 ="+mediaArray(PrimerTri));
		System.out.println("medida del trimestre 2 ="+mediaArray(SegundoTri));
		System.out.println("medida del trimestre 43 ="+mediaArray(TercerTri));
		for(int i=0;i<TercerTri.length;i++) {
		try {
			System.out.println("Notamedia del alumno:"+mediaAlumno(i, PrimerTri,SegundoTri,TercerTri));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		}
	}
	
	
	
	
	
	
	
	
	
	/**
	 * Función que rellena un array con valores pedidos por teclado
	 * @param miArray: array donde se almacenan los valores pedidos
	 */
	
	public static void rellenaArray(int [] a) {
		for(int i=0;i<a.length;i++) {
		    try {
		    	a[i]=pideValor(i);
			} catch (Exception e) {
				i--;
				System.out.println(e);
			}
		}
	}
	
	
	
	
	
	
	
	/**
	 * metodo que pide un valor entero entre 0 y 10,
	 * cuando el numero introducido no esta entre 0 y 10, lanza excepcion
	 * @param i: tendrá la posición del elemento dentro del array, servirá para informar al usuario unicamente
	 * @return valor entero
	 * @throws Exception: lanzará la excepcion cuando el numero sea 0 o menos que 0
	 */
	public static int pideValor(int i) throws Exception {
		int valor=-1;
		valor=leeEntero("introduce numero para posición "+ i +" :");
		if(valor<0 || valor>10) {
			throw new Exception("Error, el numero debe ser entre 0 y 10");
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
	
	
	
	/**
	 * calcula la media de un array
	 * @param: array donde se almacena la media 
	 */
	public static double mediaArray(int[]b){
		
		double media=0;
		double suma=0;
		for(int i=0;i<b.length;i++) {
			suma+=b[i];
		}
		
		media=suma/b.length;
		return media;
	}
	
	
	
	
	
	
	public static double mediaAlumno (int pos, int[] PrimerTri,int[]SegundoTri,int[]TercerTri)throws Exception {
		if(pos>PrimerTri.length || pos<0) {
			throw new Exception ("indice fuera de rango");
			
		}
		
		return (double)(PrimerTri[pos]+SegundoTri[pos]+TercerTri[pos])/3;
	} 
	
	
}

