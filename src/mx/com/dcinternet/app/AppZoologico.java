package mx.com.dcinternet.app;
import mx.com.dcinternet.animales.Animal;

import mx.com.dcinternet.herramientas.Util;
import mx.com.dcinternet.rh.Empleado;
import mx.com.dcinternet.animales.Oviparo;
import mx.com.dcinternet.animales.Tortuga;
import mx.com.dcinternet.animales.Perico;

class AppZoologico { //
	public static void main(String[] parametros) {
	/*	if (parametros.length != 2) {
			System.out.println("Esta aplicacion requiere dos parametros");
			System.exit(0);
		}*/
		//Util.separador();
		//System.out.println("BIENVENIDO A LA SECCION ZOOLOGICO " + parametros[0] + " FELIZ AÑO " + parametros[1]);
		System.out.println("BIENVENIDO A LA SECCION ZOOLOGICO ");
		Util.separador();
		System.out.println(Oviparo.definicion);
		Util.separador('$', 15);
		
//Oviparo ov = new Oviparo();//crea un espacio en la memoria para que pueda ser usado(depende de las variables)
//Oviparo ov1 = new Oviparo();
		Tortuga t1 = new Tortuga();
		//Tortuga t2 = new Tortuga("ADRIAN",9,100); //INICIALIZAR LOS VALORES DE LA INSTANCIA, PARA LLEVAR UN CONTADOR
		Perico p1 = new Perico();
		Perico p2 = new Perico();
		Perico p3 = new Perico();
		Empleado em = new Empleado("ANDRES","RODRIGUEZ");
		Empleado em2 = new Empleado("JAVIER","MARTINEZ");
		Empleado em3 = new Empleado();
		//Oviparo ov = new Oviparo(); No lo permite por ser clase Abstracta
		
		
//Util ut = new Util();
		em.nombre = "ANDRES";
		/*em.apellido = "RODRIGUEZ";*/
		em3.nombre = "RAUL";
		t1.nombre = "Pepe";
		//t1.numeroHuevos = 70;
		t1.velocidad = 10.3;
		t1.ponerHuevos();
		p1.nombre = "Francis";
		p2.nombre = "Luis";
		p3.nombre = "Kevin";
		//p1.numeroHuevos = 1;

		/*
		 * ov1.nombre = "Panchito"; ov1.numeroHuevos = 10; ov1.ponerHuevos();
		 * System.out.println(ov1.numeroHuevos); ov.nombre = "Juanito"; ov.numeroHuevos
		 * = 50; ov.ponerHuevos();
		 */
		Animal ov3;
		ov3 = t1;
		ov3 = p1;
		
//System.out.println(ov3.velocidad);
		//ov3.ponerHuevos();
		ov3.comer();
		p1.comer();
		ov3.comer();
		Perico[] pericos = { p1, p2, p3 };

		Util.separador();
		Util.darDeComer(pericos);
		Util.darDeComer(p1);
		Util.darDeComer(p2);
		Util.darDeComer(t1);
		//Oviparo.contadorOviparos--;
	//	t1.contarOviparo();
		System.out.println(Oviparo.getContadorOviparo());
		System.out.println(t1.ponerHuevos());
		//em.getEmpleado();//aqui se maneja una variable de instancia
		System.out.println("Vuelve pronto te atendio " + em.nombre);
		System.out.println("Con su asistente " + em2.nombre);
		System.out.println("Te atendieron  " + Empleado.contadorEmpleados + " empleados ");
		System.out.println("TOTAL DE PERICOS ES " + Perico.getContadorPericos());

	}
//p1 = null; //ya no esta referenciando a una localidad de memoria
	
	
}
//