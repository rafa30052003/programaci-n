package Modelo;

public class Tractor {
	private String Remolque;

	public Tractor() {
		super();
		this.Remolque=" ";
	}

	public Tractor(String remolque) {
		super();
		this.Remolque = remolque;
	
	}

	public String getRemolque() {
		return Remolque;
	}

	public void setRemolque(String remolque) {
		Remolque = remolque;
	}

	@Override
	public String toString() {
		return "Tractor "+super.toString()+" Remolque:"+Remolque;
	}
	
	
	
	
	
	
	
}
