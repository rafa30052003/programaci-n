package Colegio;

public class boletin {

	public static void main(String[] args) {
		
		Grupo g = new Grupo ("1ºA",3);
		
		Alumno a =new Alumno("Maria",7.5);		
		Alumno b =new Alumno("José",4);		
		Alumno c =new Alumno("Damiá",9.9);		

		System.out.println(g);
		
		Alumno eliminado=g.eliminaAlumno("José");
		
		if(eliminado ==null) {
			System.out.println("el alumno no está en el grupo");
		}else {
			System.out.println("Se ha eliminado el alumno "+ eliminado);	
		}
		
		System.out.println(g);
		
	}

}
