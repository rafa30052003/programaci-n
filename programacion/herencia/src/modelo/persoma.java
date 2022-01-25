package modelo;

import java.util.Objects;

public class persoma {
	 private String DNI="";
	 private String Nombre="";
	 private int Edad=0;
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public persoma(String dNI, String nombre, int edad) {
		super();
		 this.DNI = dNI;
		this.Nombre = nombre;
		this.Edad = edad;
	}
	@Override
	public String toString() {
		return "persoma [DNI=" + DNI + ", Nombre=" + Nombre + ", Edad=" + Edad + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI, Edad, Nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		persoma other = (persoma) obj;
		return Objects.equals(DNI, other.DNI) && Edad == other.Edad && Objects.equals(Nombre, other.Nombre);
	}
	 
	 
	 
	 
}
