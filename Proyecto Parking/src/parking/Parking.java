package parking;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Parking {
	//Atributos
	Vehiculo[] arrayCoches;
	ArrayList<Vehiculo> listCoches;
	Vector<Vehiculo> vectorCoches;
	//Constructores
	public Parking() {
		super();
		this.arrayCoches = new Vehiculo[4];
		this.listCoches = listCoches;
		this.vectorCoches = vectorCoches;
	}
	
	//Getters && Setters
	//Otros Metodos
	public void entrada(Scanner in) {

	int opcion;
	do {
		do {
			System.out.println("Elige una opción:" + "\n	1. Entrada al parking." + "\n	2. Entrada al Descampao." + "\n	3. Atras.");
			opcion = in.nextInt();
		} while (opcion < 1 || opcion > 3);

		switch (opcion) {
		case 1:
			parking();
			break;
		case 2:
			System.out.println(2);
			break;

		default:
			break;
		}

	} while (opcion != 3);//



}
	//ToString

	private void parking() {
		if (arrayCoches==null) {
			System.out.println("El parking no esta creado");
		}
		
	}
}
