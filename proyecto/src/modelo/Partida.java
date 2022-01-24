package modelo;

import java.util.Scanner;

public class Partida {
	private Personajes []pers=new Personajes[6];
	


	public Partida() {
		super();
		Guerreros a=new Guerreros ("Thor",60,10,5,10);
		Guerreros b=new Guerreros ("AironMan",55,15,7,12);
		Guerreros c=new Guerreros ("CapitanAmerica",50,20,5,15);
		Magos d=new  Magos("Mago fuego",70,20,5,12);
		Magos e=new  Magos("Mago hielo",100,15,3,10);
		Magos f=new  Magos("Mago electrico",60,25,7,15);
	    pers[0]=a;
	    pers[1]=b;
	    pers[2]=c;
	    pers[3]=d;
	    pers[4]=e;
	    pers[5]=f;
	    
	}
	
	public static String eligePers(Personajes pers[]) {
		Scanner e = new Scanner (System.in);
		String elegido=" ";
		for (int i = 0; i < pers.length; i++) {
			System.out.println(pers[i]);
		}
		elegido=e.nextLine();
		
		
			
		return elegido;
	}
	
	
}
