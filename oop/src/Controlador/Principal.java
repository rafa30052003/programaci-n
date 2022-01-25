package Controlador;

import Utils.IO;
import Vista.Menu;
import model.Partida;

public class Principal {
	public static void start() {
		String nombre=Menu.preguntaNombreJugador();
		int d;
		try {
			d = Menu.preguntaPorElDado();
			Partida p1=new Partida(nombre,d);
			p1.jugar();
			Menu.imprimeGanador(p1.quienGano());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido jugar");
		}

	}
}
