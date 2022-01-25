package model;

public class Jugador {
	private String nombre;
	private int puntuacion;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		puntuacion=0;
	}
	public Jugador() {
		this("CPU");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public void tiraDado(Dado d) {
		int puntos=d.throwValue();
		this.puntuacion+=puntos;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
	}
	
	
}
