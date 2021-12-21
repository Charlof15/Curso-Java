package mx.com.dcinternet.animales;

public class Tortuga extends Oviparo implements Animal {
	
	public double velocidad;

	public void comer() {
		System.out.println("Comiendo como Tortuga");
	}

	@Override
	public int ponerHuevos() {
		
		int n = (int) (Math.random() * 10);
		numeroHuevos += n ;
		
		
		return n;

	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

}
