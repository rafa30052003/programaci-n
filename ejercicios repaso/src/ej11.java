
public class ej11 {

	public static void main(String[] args) {
		int comision=50000000;
		int beneficios;
		if(comision>500.000){
			beneficios=(comision*10)/100;
			System.out.println(beneficios);
		}else if(200.000<comision &&comision<500.000){
			beneficios=(comision*7)/100;
			System.out.println(beneficios);
		}

	}

}
