package Colegio;

public class boletin {

	public static void main(String[] args) {
		
		Grupo g = new Grupo ("1�A",3);
		
		Alumno a =new Alumno("Maria",7.5);		
		Alumno b =new Alumno("Jos�",4);		
		Alumno c =new Alumno("Dami�",9.9);		

		System.out.println(g);
		
		Alumno eliminado=g.eliminaAlumno("Jos�");
		
		if(eliminado ==null) {
			System.out.println("el alumno no est� en el grupo");
		}else {
			System.out.println("Se ha eliminado el alumno "+ eliminado);	
		}
		
		System.out.println(g);
		
	}

}
