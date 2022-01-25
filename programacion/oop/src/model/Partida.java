package model;

import Utils.IO;

public class Partida {
	
	Jugador player1;
	Jugador cpu;
	Dado dado;
	
	public Partida(String nameJugador, int caras) {
		player1=new Jugador(nameJugador);
		cpu=new Jugador();
		dado=new Dado(caras);
	}
	public void jugar() {
		cpu.tiraDado(dado);
		player1.tiraDado(dado);
	}
	public Jugador quienGano() {
		Jugador ganador=null;
		if(cpu.getPuntuacion()>player1.getPuntuacion()) {
			ganador=cpu;
		}else if(player1.getPuntuacion()>cpu.getPuntuacion()){
			ganador=player1;
		}
		return ganador;
	}
	
}
