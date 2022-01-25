package pruevaArrive;

public class ej8pdf {

	public static void main(String[] args) {
		int[]miArray=new int [7];

	}
	public static  int [] suma(int []t, int nElem) {
		int tamS=t.length-nElem+1;
		int []s=new int[tamS];
			for (int i = 0; i < tamS; i++) {
				for (int j = 0; j <nElem; j++) {
					s[i]=s[i]+t[i+j];
				}
			}
			return s;
	}
}
