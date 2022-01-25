package modelo;

public class animal {
	private String especie;
	private boolean female;
	
	
	
	
	public animal(String especie, boolean female) {
		super();
		this.especie = especie;
		this.female = female;
	}
	
	public animal() {
		this("Desconocido", true);
		
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	@Override
	public String toString() {
		return "animal [especie=" + especie + ", female=" + female + "]";
	}
	
	
	
	public static String getFunciones() {
		
	}
	
	
	
}
