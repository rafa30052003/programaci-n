package Colegio;



public class Alumno {
	
	private String nombre;
	private double nota;
	
	
	
	
	public Alumno(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
		
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public double getNota() {
		return nota;
	}




	public void setNota(double nota) {
		this.nota = nota;
	}




	@Override
	public String toString() {
		return "nombre=" + nombre + ", nota=" + nota;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
	    
		boolean result=false;
			
		if (this == obj)
			result = true;
		else if(obj==null) {
			result=false;
		}else {
			Alumno tmp = (Alumno)obj;
			if(tmp.nombre==this.nombre) {
				result =true;
			}
		}
		return result;
			
	}
	
	
	
}
