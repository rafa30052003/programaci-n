package prueba;



public class viernes {

	public static void main(String[] args) {
		char[] abc=new char[26];
		rellenaLetras(abc);
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i]+" ");
		}
		System.out.println("");
		Piramide1(abc,6);
		Piramide2(abc,6);
		Piramide3(abc,4);
		
		
		
		
	}
		public static void rellenaLetras(char[]abc) {
			for (int i = 0; i < abc.length; i++) {
				abc[i]=(char)(i+97);
			}
		}
		
		
		
		
		
		
		public static void Piramide1(char[]abc, int t) {
			int aux=0;
			for (int i = 0; i < t; i++) {
				for (int j = i; j <= (i+aux); j++) {
					System.out.print(abc[j]);
				}
				aux+=1;
				System.out.println("");
			}
		}
		
		public static void Piramide2(char[]abc, int t) {
			for (int i = 0; i < t; i++) {//las i son las filas 
				for (int j = 0; j <(t-i-1); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <=i; j++) {
					System.out.print(abc[j]);
				}
				System.out.println("");
			}
		
		}
		
		
		
		
		
		public static void Piramide3(char[]abc, int t) {
			for (int i = 0; i < t; i++) {
				for (int j = 0; j < (t-i-1); j++) {
					System.out.print("");
				}
				for (int j = i; j >=0; j--) {
					System.out.print(abc[j]);
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(abc[j]);
				}
				System.out.println("");
			}
		}
		
		
		
		
		
		
		
}
