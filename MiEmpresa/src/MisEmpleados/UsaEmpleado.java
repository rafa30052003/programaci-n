package MisEmpleados;
import util.introduce;
import Mismenus.menuEmpledado;

public class UsaEmpleado{
	public static void main(String[] args) {
		
		
		Empleado e1=new Empleado("Pedro","programación",29,1500);
		System.out.println(e1);
		System.out.println();
		menuEmpledado.menu(e1);
		System.out.println();
	}
}