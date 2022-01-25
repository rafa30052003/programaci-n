import java.util.Scanner;

public class ej24 {

	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		System.out.println("introdduce el nº1");
		int n1=t.nextInt();
		System.out.println("introdduce el nº2");
		int n2=t.nextInt();
		int opcion;
		int resultado;
		System.out.println("1. para suma");
		System.out.println("2. para resta");
		System.out.println("3. para multiplicar");
		System.out.println("4. para dividir");
		opcion=t.nextInt();
		
		switch(opcion){
		case 1: 
		resultado=n1+n2;
		System.out.println(n1+"+"+n2+"="+resultado);
		break;
		case 2: 
			
			resultado=n1-n2;
			System.out.println(n1+"-"+n2+"="+resultado);
			break;
		case 3: 
			resultado=n1*n2;
			System.out.println(n1+"*"+n2+"="+resultado);
			break;
		case 4: 
			if(n2>n1){
				int tmp=n1;
				n1=n2;
				n2=tmp;
			}
			resultado=n1/n2;//preguntar si aquí se puede hacer casting
			System.out.println(n1+"/"+n2+"="+resultado);
			break;
		}

	}
}
