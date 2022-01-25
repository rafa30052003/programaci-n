
public class ej3array {

	public static void main(String[] args) {
		int[]a=new int[10];

	}
	public static int MuestraValor(int[]a) {
		int Mayor=-1;
		int PosMayor=-1;
		for (int i = 0; i < a.length; i++) {
			if(mayor<a[i]){
				Mayor=a[i];
				PosMayor=i;
				
			}
		}
	}
}
