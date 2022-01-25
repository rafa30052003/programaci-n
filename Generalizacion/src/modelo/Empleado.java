package modelo;

public class Empleado {
	private String name;
	private String dpto;
	private int age;
	private double salary;

	
	public Empleado(String name, String dpto,int age, double salary) {
		this.name=name;
		this.dpto=dpto;
		this.age=age;
		this.salary=salary;
	}


	public Empleado(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dpto="";
	}


	public Empleado(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salary=0;
		this.dpto="";
	}
	
	public Empleado() {
		this.name="";
		this.dpto="";
		this.age=-1;
		this.salary=0;
	}


	
	
	
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDpto() {
		return dpto;
	}


	public void setDpto(String dpto) {
		this.dpto = dpto;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	/**
	 * aumenta el sueldo una cantidad fija
	 * @param aumento la cantidada que suvimos el salario
	 * @return devuelve true si el aumeno introducido es positivo y false si es negativo
	 */
	
	public boolean increaseSalary(double aumento) {
		boolean correcto=false;
		if(aumento>=0) {
		this.setSalary(this.getSalary() +aumento);
		correcto=true;
		}
		return correcto;
	}
	
	
	
	
	
	
	/**
	 * aumenta el sueldo un porcentaje indicado como parametro
	 * @param aumento es el porcentaje quese aimenta el sueldo
	 * @returndevuelve true si el aumeno introducido es positivo y false si es negativo
	 */
	public boolean increaseSalary(int aumento) {
		boolean correcto=false;
		if(aumento>=0) {
		this.salary=this.salary+(this.salary*((float)aumento)/100);
		correcto=true;
		}
		return correcto;
	}


	
	
	
	
	
	@Override
	public String toString() {
		return "Empleado=" + this.name +  "\ndpto=" +this.dpto+  "\nage=" +this.age + "\nsalary="+ this.salary;
	}
	
	
	
	
	
	
}
