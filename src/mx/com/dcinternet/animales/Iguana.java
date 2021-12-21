package mx.com.dcinternet.animales;

public class Iguana extends Oviparo implements Animal {

	@Override
	public int ponerHuevos() {
		return (int) (Math.random()*1000);
		
	}

	@Override
	public void comer() {
		System.out.println("Comiendo hojitas");
		
	}

	@Override
	public void dormir() {
		System.out.println("Durmiendo en un arbolito ");
	}

}
