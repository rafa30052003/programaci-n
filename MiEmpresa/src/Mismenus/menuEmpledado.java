package Mismenus;

import java.util.Scanner;


import MisEmpleados.Empleado;

public class menuEmpledado {

	public static boolean menu(Empleado e) {
		Scanner sn = new Scanner(System.in);
		boolean salir=false;
		int opcion;
		
		do{ 
			System.out.println("1. Modificar parametros");
			System.out.println("2. Aumenta sueldo con importe fijo");
			System.out.println("3. Aumentar sueldo con porcentaje ");
			System.out.println("4. Salir");
			opcion=sn.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("1. modifica name");
				System.out.println("2. modifica dpto ");
				System.out.println("3. modifica age");
				System.out.println("4. modifica salary");
				System.out.println("5. salir");
				System.out.println("Escribe una de las opciones");
				opcion=sn.nextInt();
				
				switch(opcion) {
				case 1:
					String nombre;
					System.out.println("nombre:");
					nombre=sn.nextLine();
					nombre=sn.nextLine();
					e.setName(nombre);
					System.out.println(e);
					break;
				case 2:
					String dpto;
					System.out.println("dpto:");
					dpto=sn.nextLine();
					dpto=sn.nextLine();
					e.setDpto(dpto);
					break;
				case 3: 
					int age;
					System.out.println("age:");
					age=sn.nextInt();
					age=sn.nextInt();
					e.setAge(age);
					break;
				case 4:
					double salary;
					System.out.println("salary:");
					salary=sn.nextDouble();
					salary=sn.nextDouble();
					e.setSalary(salary);
					break;
				case 5:
					salir=true;
				default:
				System.out.println("Solo numeros entre 1 y 5");
				}
				break;
			case 2:	
				double salary;
				System.out.println(" salary actual:"+e.getSalary());
				
				subesueldo(e);
				
				break;
			case 3:
				double salary2;
				System.out.println(" salary actual:"+e.getSalary());
				
				subesueldoPr(e);
				break;
				
				
			case 4:
				salir=true;
			}
						
		}while(!salir);
		return salir;
	}
	
	
	
	public static void subesueldo( Empleado e1) {
		double n=0;
		Scanner p=new Scanner (System.in);
		System.out.println("introduce el  aumento de sueldo");
		n= p.nextDouble();
		e1.increaseSalary(n);
		System.out.println(e1.getSalary());
		
	}
	
	public static void subesueldoPr( Empleado e1) {
		int p=0;
		Scanner n=new Scanner (System.in);
		System.out.println("introduce el porcentaje");
		p=n.nextInt();
		e1.increaseSalary(p);
		System.out.println(e1.getSalary());
	}
	
}
