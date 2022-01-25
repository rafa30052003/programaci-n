import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("introduce la medida del lado");
		int lado=n.nextInt();
		perimetro(lado);
		area(lado);
	}
	public static int perimetro(int lado) {
		int perimetro;
		perimetro=lado+lado+lado+lado;
		System.out.println(perimetro);
		return perimetro;
		
		
	}

	public static int area(int lado) {
		int area;
		area=lado*lado;
		System.out.println(area);
		return area;
	}	



}
