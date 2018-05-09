package parking;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//objeto
		Parking parkco = new Parking();
		Scanner in = new Scanner(System.in);
		int opcion;

		do {
			do {
				System.out.println(
						"Elige una opción:" + "\n	1. Entrada." + "\n	2. Salida." + "\n	3. ." + "\n	4. ." + "\n	5. ." + "\n	6. .");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 6);

			switch (opcion) {
			case 1:
				//	objeto.metodo(in);
				parkco.entrada(in);
				

				break;
			case 2:
				//objeto.metodo(in);
				break;
			case 3:
				//objeto.metodo(in);;
				break;
			case 4:
				//Metodos
				break;
			case 5:
				//Metodos
				break;

			}
		} while (opcion != 6);

		in.close();
	}

}