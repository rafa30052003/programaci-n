import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1="hola";//forma simple de crear un String
		String cadena2=new String ("Mundo");//forma de crear un objeto String
		System.out.println(cadena1+" "+cadena2);
		
//*********************************************************************************************//
		String cad="Mi perro \"perico\" es de color blanco";
		System.out.println(cad);
		
//*********************************************************************************************//		
		
		String cadena="Esto es un ejemplo \n de String de \n varias lineas";
		System.out.println(cadena);
		
//*********************************************************************************************//
	
		String cadena3="Hola ";
		String cadena4="Mundo";
		
		if(cadena1==cadena2) {
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
		}
	
//*********************************************************************************************//	
		String cadena5="Hola ";
		String cadena6="mundo ";
		String cadena7="ahora";
		String cadena8="hola";
		if(cadena5.compareTo(cadena6)==0) {
			System.out.println("cadena 1 y cadena2 son iguales");
		}else if(cadena5.compareTo(cadena6)<0) {
			System.out.println("");
		}else if(cadena5.compareTo(cadena6)>0) {
			System.out.println("cadena2 va despues de cadena 1");
		}	
//*********************************************************************************************//			
			String nombre="Predro";
			String apellido="ruiz";
			String apellido2="aranda";
			String nombreCompleto=nombre+" "+apellido+" "+apellido2;
			System.out.println(nombreCompleto);
//*********************************************************************************************//
			String a="Resultado "+3;
			String b="Resultado "+true;
			String c="Resultado "+'a';
			System.out.println(a);
//*********************************************************************************************//
			String cadena9="Hellow word";
			char cadena10=cadena9.charAt(0);
			System.out.println(cadena10);
//*********************************************************************************************//
			String cadena11="una mañana al despertarme de un mundo intranquilo";
			String cadena12=cadena11.substring(14,31);//cad12 vale "un mundo intranquilo"
			System.out.println(cadena12);
//*********************************************************************************************//		
			String cad11="___Mi_perro_se_llama_paco";
			String cad12=cad11.strip();
			System.out.println(cad12);
			
//*******************************************ACTIVIDAD*****************************************//
			Scanner sc = new Scanner(System.in);
			// leemos las dos frases
			System.out.println("Primera frase: ");
			String frase1 = sc.nextLine();
			System.out.println("Segunda frase :");
			String frase2 = sc.nextLine();
			// calculamos la longitud de cada palabra
			int longFrase1 = frase1.length();
			int longFrase2 = frase2.length();
			// comparamos los tamaños
			if (longFrase1 == longFrase2){
			System.out.println("Son de idéntica longitud");
			}
			else if (longFrase1 < longFrase2){
			System.out.println(frase1 + " es más corta que " + frase2);
			}
			else{
			System.out.println(frase2 + " es más corta que " + frase1);
			}
//*******************************************ACTIVIDAD*****************************************//	
			Scanner dc = new Scanner (System.in);
			String antes, despues;
			System.out.println("Escribe una frase: ");
			antes= dc.nextLine();
			despues= alReves(antes);
			System.out.println(despues);
					
					
			//}
			/*static String alReves(String original){
			String nueva = "";
			for (int i = 0; i < original.length(); i++){
			nueva = original.charAt(i) + nueva; //concatenamos el carácter antes que nueva
			}
			return nueva;
			}*/
			
//*******************************************ACTIVIDAD*****************************************//				
			Scanner ec = new Scanner (System.in);
			String cadena0;
			String subcadena;
			System.out.println("escribe una frase: ");
			for (int i = 0; i < args.length; i++) {
				
			}
				
			
			
	}
}
