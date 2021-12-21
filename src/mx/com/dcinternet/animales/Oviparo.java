package mx.com.dcinternet.animales
;

import mx.com.dcinternet.herramientas.Util;

public abstract class Oviparo  { // create table

//definiendo estructura de datos
	public String nombre;
	protected int numeroHuevos;
	public static String definicion = "Se aplica a los animales cuya hembra expulsa los huevos al exterior cuando los embriones están sin desarrollar o en una fase muy primitiva de desarrollo.";
	private static int contadorOviparos;
	
	/*
	 * Una clase abstracta por lo menos debe tener un metodo abstracto
	 * Me ayuda a heredar metodos a otras clases
	 */
	public abstract int ponerHuevos() ;
/*numeroHuevos=5;
		System.out.println(nombre + " puso " + numeroHuevos + " huevos ");
	}

	public abstract void comer();*/
	

	public  static int getContadorOviparo() {
		Util.separador();
		return contadorOviparos;	
		
	}
	
	public Oviparo() {
		System.out.println("2Este es un mensaje desde el metodo Oviparo");
		contadorOviparos ++;
		
	}
	
	
	public int getTotalHuevos() {
	
		return numeroHuevos; //tarea getContadorOviparo
		
		
	}
	
	
}
