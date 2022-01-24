package modelo;

public class Guerreros extends Personajes {
	private int poderAtaqueEspecial;

	public Guerreros() {
		super();
		this.poderAtaqueEspecial=-1;
	}

	public Guerreros(String nombre, int vida, int defensa, int ataque, int poderAtaqueEspecial) {
		super(nombre, vida, defensa, ataque);
		this.poderAtaqueEspecial= poderAtaqueEspecial;
	}

	public int getPoderAtaqueEspecial() {
		return poderAtaqueEspecial;
	}

	public void setPoderAtaqueEspecial(int poderAtaqueEspecial) {
		this.poderAtaqueEspecial = poderAtaqueEspecial;
	}
	@Override
	public String toString() {
		return "Guerreros "+super.toString()+" poderAtaqueEspecial:"+poderAtaqueEspecial;
	}
	
	
	
}
