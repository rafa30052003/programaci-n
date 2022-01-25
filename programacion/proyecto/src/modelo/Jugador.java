package modelo;

public class Jugador {
	private String nombre;

	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Jugador() {
		super();
		this.nombre = " ";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + "]";
	}
	
	
	
	
}
