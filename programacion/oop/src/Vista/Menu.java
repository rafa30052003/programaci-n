package Vista;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import Utils.IO;
import model.Jugador;

public class Menu {
	public static String preguntaNombreJugador() {
		System.out.print("Nombre del player1: ");
		return IO.leeFrase();
	}
	public static int preguntaPorElDado() throws Exception{
		System.out.print("Caras del dado: ");
		int n= 6;
		try {
			n=IO.leeEntero();
		}catch (InputMismatchException e) {
			
		}catch(IllegalStateException e) {
			
		}catch(NoSuchElementException e) {
			
		}
		
		if(n<2) {
			throw new Exception("Dado no válido");
		}
		
		return n;
	}
	public static void imprimeGanador(Jugador j) {
		if(j!=null) {
			System.out.println("EL GANDOR ES.....");
			System.out.println(j);
		}else {
			System.out.println("HUBO UN EMPATE");
		}
	}
}
