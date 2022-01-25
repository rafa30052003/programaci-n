import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce nota 1");
		float n1=teclado.nextFloat();
		System.out.println("introduce nota 2");
		float n2=teclado.nextFloat();
		float media;
		media=(n1+n2)/2;
		System.out.println(media);
		if(media>=5){
			System.out.println("estas aprobado");
		}else {
			System.out.println("estas suspenso");
		}
		
	}

}
