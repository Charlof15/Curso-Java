package mx.com.dcinternet.animales;

import java.util.regex.Matcher;

public class Perico extends Oviparo implements Animal {
	private static int contadorPericos;

	public Perico() {
		super();
		contadorPericos++;
		System.out.println("Este es el constructor de perico");
		
	}
	
	public static int getContadorPericos() {
		return contadorPericos;
	}
	public void comer() {
		System.out.println("Comiendo como Perico");
		System.out.println("Cambio para el commit");
		System.out.println("Cambio para el kkk");
		System.out.println("Cambio para el lll");
	}
	
	

	@Override
	public int ponerHuevos() {
		return (int) (Math.random()*1000);
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}
	
	

}