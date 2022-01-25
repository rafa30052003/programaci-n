package clasesConGenericos;

public class Contenedor<T> {
	private T obj;

	public Contenedor() {
		this.obj = null;
		// TODO Auto-generated constructor stub
	}

	public Contenedor(T obj) {
		super();
		this.obj = obj;
	}
	 public T getobj() {
		 T objDev = this.obj;
		 this.obj=null; //el contenedor vuelve a estar vacio.
		 return objDev;
	 }
	 
	 public void setobj(T obj) {
		 this.obj=obj;
	 }
}
