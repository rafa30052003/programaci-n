package modelo;

public class lista {
	private Object []elementos;
	private int i=0;
	
	
	public lista(int n) {
		elementos=new Object[n];
		
	}
	public Object get (int i) {
		return elementos[i];
		
	}
	public void add (Object o) {
		elementos[i]=o;
		i++;
	}
}
