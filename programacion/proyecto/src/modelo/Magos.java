package modelo;

public class Magos extends Personajes {

	private int poderDefensaEspecial;

	public Magos() {
		super();
		this.poderDefensaEspecial=-1;
	}
	public Magos(String nombre, int vida, int defensa, int ataque, int  poderDefensaEspecial) {
		super(nombre, vida, defensa, ataque);
		this.poderDefensaEspecial=  poderDefensaEspecial;
	}

	public int getPoderDefensaEspecial() {
		return poderDefensaEspecial;
	}

	public void setPoderDefensaEspecial(int poderDefensaEspecial) {
		this.poderDefensaEspecial = poderDefensaEspecial;
	}

	@Override
	public String toString() {
		return "Magos "+super.toString()+" poderDefensaEspecial:"+poderDefensaEspecial;
	}
	
	
	
	
	
}
