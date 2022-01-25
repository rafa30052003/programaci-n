
public class ej11array {

	public static void main(String[] args) {
		int []miarray= new int[5];
		rellenaAleatorio(miarray);
		for (int e:miarray) {
			System.out.print(e+" ");
		}
		System.out.println("");
		ordenaArray(miarray);
		for (int i = 0; i < miarray.length; i++) {
			 System.out.print(miarray[i]+" ");
		}
		

	}
	public static void ordenaArray(int[]miarray) {
		for (int i = 0; i < miarray.length; i++) {
			for (int j = i+1; j < miarray.length; j++) {
				if(miarray[i]>miarray[j]) {
					int tmp=miarray[i];
					miarray[i]=miarray[j];
					miarray[j]=tmp;
				}
				
				
			}
			
		}
		
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
}
