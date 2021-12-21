package mx.com.dcinternet.rh;

import mx.com.dcinternet.herramientas.Util;

public class Empleado {
	public String nombre;
	public String apellido;//variable de instancie (estas existente hasta que instancie esta clase)
	public static int contadorEmpleados; //variable de clase
	
	
	
	/*public Empleado() { //Es un metodo que se ejecuta cuando se instancia esa class
		Util.separador();
		System.out.println("Hola soy " + nombre + " te acompañare en todo el recorrido");
		Util.separador();
	
	}*/
	
	public Empleado() {
		contadorEmpleados++;
		
	}
	
	
	public Empleado(String nombre, String apellido) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		Util.separador();
		System.out.println("Hola soy 2 " + nombre + " " + apellido +" te acompañare en todo el recorrido");
		Util.separador();
	
		
	}	

	
	

}
