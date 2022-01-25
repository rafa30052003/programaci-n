package clasesConGenericos;

import modelo.Empleado;

public class usaContenedor {

	public static void main(String[] args) {
		//Ejemplo 1: 
			/*Contenedor<Integer> c= new Contenedor<>();*/
			Contenedor<Integer> c= new Contenedor<Integer>();
			c.setobj(5);
			
			Contenedor <String>s= new Contenedor<>();
			s.setobj("Hola");
			
			Contenedor <Empleado> e= new Contenedor<>();
			e.setobj(new Empleado("pepe","prog",28,1990));
	}
			
}
