package Modelo;

public class Vehiculo {
	protected String matricula;
	protected String marca;
	protected double kms;
	protected String modelo;
	
	
	
	public Vehiculo(String matricula, String marca, double kms, String modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.kms = kms;
		this.modelo = modelo;
	
	}
	
	
	public Vehiculo() {
		this.matricula = " ";
		this.marca = " ";
		this.kms = -1;
		this.modelo = " ";
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getKms() {
		return kms;
	}


	public void setKms(double kms) {
		this.kms = kms;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", kms=" + kms + ", modelo=" + modelo + "]";
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null) {
			if (this == obj) {
				result = true;
			} else {
				
				if((obj instanceof Vehiculo) && (obj !=null)){
					Vehiculo tmp = (Vehiculo) obj;
					if (tmp!=null && this.matricula!=null && this.matricula == tmp.matricula) {
						result = true;
					}
				}
			}
		}
		return result;
	}
	
	
	
}

