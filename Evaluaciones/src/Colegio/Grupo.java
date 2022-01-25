package Colegio;

import java.util.Arrays;





public class Grupo {
	private String nGrupo;
	private Alumno [] nAlumnos;
	
	
	
	
	
	public Grupo(String nGrupo, int pers) {
		super();
		this.nGrupo = nGrupo;
		nAlumnos = new Alumno [pers];
	}





	public String getnGrupo() {
		return nGrupo;
	}





	public void setnGrupo(String nGrupo) {
		this.nGrupo = nGrupo;
	}





	public Alumno[] getnAlumnos() {
		return nAlumnos;
	}





	public void setnAlumnos(Alumno[] nAlumnos) {
		this.nAlumnos = nAlumnos;
	}





	@Override
	public String toString() {
		return "nGrupo:" + nGrupo + ", Alumnos:" +  Arrays.toString(nAlumnos);
				
	}
	
	
	public void newAlumno(Alumno a) {
		boolean insertado=false;
		if(this.getEspacio(a)!=-1) {
			System.out.println("Alumno repetido, ya está en el GRupo "+this.getSilla(a));
		}else if (this.isFull()) {
			System.out.println("Grupo lleno, no se ha podido recivir matricula");
		}else { 
			for (int i = 0; i < nAlumnos.length && !insertado; i++) {
				if (nAlumnos[i]==null) {
					nAlumnos[i]=a;
					insertado=true;
					System.out.println("Alumno aceptado "+i);
					
				}
			}
		}
	
	}
	
	
	
	public int getEspacio(Alumno a) {
		int silla=-1;
		for (int i = 0; i < nAlumnos.length; i++) {
			if(a.equals(nAlumnos[i])) {
				silla=i;
				i=nAlumnos.length;
			}
		}
		return silla;
	}
	
	
	
	public int getSilla(String Nombre) {
		int silla=-1;
		for (int i = 0; i < nAlumnos.length; i++) {
			if(nAlumnos[i].getNombre()==Nombre) {
				silla=i;
				i=nAlumnos.length;
			}
		}
		return silla;
	}
	
	
	public boolean isFull () {
		boolean llena=true;
		
		for (int i = 0; i < nAlumnos.length; i++) {
			if(nAlumnos[i]==null) {
				llena=false;
			}
		}
		return llena;
	}
	
	
	
	
	
	
	
	
	
	
	




	public Alumno eliminaAlumno(String nombre) {
		Alumno eliminado=null;
		
		int pers = this.getSilla(nombre);
		if(pers !=-1) {
			eliminado = nAlumnos[pers];
			nAlumnos[pers]=null;		
		}
		
		return eliminado;
	}
	


	
	
	public void añadeNotas(String nombre, double nota) {
		for (int i = 0; i < nAlumnos.length; i++) {
			if(nAlumnos[i]!=null && nAlumnos[i].getNombre().equals(nombre)) {
				nAlumnos[i].setNota(nota);
			}
		}
	}
	
	public double mediaNota() {
		double media=0.0;
		for (int i = 0; i < nAlumnos.length; i++) {
			if(nAlumnos[i]!=null) {
				media=(media+nAlumnos[i].getNota())/nAlumnos.length;
			}
		}
		return media;
	}
	
	
	
	
	
	

	
	
	
	
	
}
