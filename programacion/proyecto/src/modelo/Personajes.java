package modelo;

public class Personajes {
	private String nombre;
	private int vida;
	private int defensa;
	private int ataque;
	
	
	public Personajes(String nombre, int vida, int defensa, int ataque) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.defensa = defensa;
		this.ataque = ataque;
	}


	public Personajes() {
		super();
		this.nombre = " ";
		this.vida = -1;
		this.defensa = -1;
		this.ataque = -1;
		
	}
	
	
	
	
	
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getDefensa() {
		return defensa;
	}


	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}


	public int getAtaque() {
		return ataque;
	}


	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}


	@Override
	public String toString() {
		return "Personajes [nombre=" + nombre + ", vida=" + vida + ", defensa=" + defensa + ", ataque=" + ataque + "]";
	}
	
	
}
