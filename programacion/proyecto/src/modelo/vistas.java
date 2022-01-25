package modelo;

import java.util.Scanner;

public class vistas {
	
	
	public static void MenúJugadores(Personajes []pers){
		System.out.println("elige tu jugador");
		System.out.println("----JUGADORES----");
		
		
		
	}
	public static void nRondas() {
		Scanner e = new Scanner (System.in);
		System.out.print("¿cuantas rondas quieres jugar ");
		System.out.println("(max 5)");
		int [] rondas= new int[e.nextInt()];
		rellenaArray(rondas);
	}
}
