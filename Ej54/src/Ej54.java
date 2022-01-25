
/**
 * 
 * @author rafa lucena valle
 *
 */
public class Ej54 {

	public static void main(String[] args) {
		int opcion=LeeEntero();
		do {
			imprimeMenu();
			
			switch(opcion) {
			case 1:System.out.println("introduzca s1");
					int s1=LeeEntero();
					System.out.println("introduce s2");
					int s2=LeeEntero();
					int r=suma(s1,s2);
					System.out.println("el rwsultado es"+r);
					break;
			case 2://resta;
				break;
			case 3://operacion;
				break;
			case 4://division;
				break;
			case 0:System.out.println("gracias por usarme");
				break;
			default:
				System.out.println("opcion incorrecta");
			}
		}while(opcion!=0);
		
}
	public static void imprimeMenu(){
		System.out.println("Calculadora\n---------------");
		System.out.println("suma");
		System.out.println("resta");
		System.out.println("operacion");
		System.out.println("division");
		System.out.println("salir del programa");
		System.out.println("elija una opcion:");
	}
	/**
	 * Lee un numero pro teclado
	 * @return
	 */
	public static int leeEntero() {
		int resultado=-1;
		Scanner teclado= new Scanner (System.in);
		do {
			try {
			resultado=teclado.nextInt();
			}catch (ImputMismatchException ex){
				System.out.println("Entrada no valido");
			}
		}while(valid=false);
		return resultado;
	}
	
	public static int suma(int s1, int s2){
		int resultado=s1+s2;
		return resultado; //return s1+s2
	}
}
