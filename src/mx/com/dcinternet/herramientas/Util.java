package mx.com.dcinternet.herramientas;
import mx.com.dcinternet.animales.Animal;
import mx.com.dcinternet.animales.Oviparo;
import mx.com.dcinternet.animales.Perico;
import mx.com.dcinternet.animales.Tortuga;
public class Util
{
public static void darDeComer(Perico[] pericos){
for(Perico p:pericos){
	p.comer();	}

/*for(int i=0;i<=2;i++){
System.out.println(pericos[i].nombre);
pericos[i].comer();
	}*/
}

public static void darDeComer(Animal ani ){
System.out.println("Utileria dando " );
ani.comer();
}

public static void separador(){ //implica no llamar una instancia para poder usarlo
for(int i=0; i<=20; i++){
System.out.print("*");
}
System.out.println();
}

public static void separador(char caracter, int size){
for(int i=0; i<=size;i++){
System.out.print(caracter);
}
System.out.println();

}

/*void darDeComer(Perico p){
System.out.println("Utileria dando " + p.nombre);
p.comer();

	}
public void darDeComer(ArrayList pericos){

}
void darDeComer(Tortuga t){
t.comer();
}*/
}