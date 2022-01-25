package Modelo;

public class Coche extends Vehiculo {
	private String Luna;
	
	
	
	public Coche() {
	super();
	this.Luna=" ";
	}
	
	public Coche(String matricula, String marca, double kms,String modelo,String Luna) {
		super(matricula, marca, kms, modelo);
		this.Luna=Luna;
	}

	public String getLuna() {
		return Luna;
	}

	public void setLuna(String luna) {
		Luna = luna;
	}
	
	@Override
	public String toString() {
		return "Coche "+super.toString()+" Luna:"+Luna;
	}
	
	
}
