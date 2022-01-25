package Modelo;

public class Moto extends Vehiculo {
	
	private String patilla;
	
	
	public Moto() {
		super();
		this.patilla=" ";
	}
	
	
	public Moto(String matricula, String marca, double kms,String modelo,String patilla) {
		super(matricula, marca, kms, modelo);
		this.patilla=patilla;
	}


	public String getPatilla() {
		return patilla;
	}


	public void setPatilla(String patilla) {
		this.patilla = patilla;
	}


	@Override
	public String toString() {
		return "Moto "+super.toString()+" patilla:"+patilla;
	}
	
	
	
}
