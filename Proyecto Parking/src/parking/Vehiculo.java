package parking;

import java.util.Scanner;

public class Vehiculo {
	//Atributos
	String Matricula;
	//Constructores

	public Vehiculo(String matricula) {
		super();
		Matricula = generadorMatriculas();
	}

	
	//Getters && Setters
	//Otros Metodos
	
	private String generadorMatriculas() {		
	String matricula="";
		int numero;
		char c;
		for (int i = 0; i < 7; i++) {
			if (i<4) {
				numero=(int)(Math.random()*10);
				matricula+=String.valueOf(numero);			
			}else {
				c=(char)(Math.random()*26+65);//recorremos 26 numeros empezando por el 65
				if (i==4) {
					matricula+="-"+c;
				}else {
					matricula+=c;
				}
				
			}
			
		}
		System.out.println(matricula);
		
		return matricula;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ascii=0;
		String caracteresNodeseados= "aeiouAEIOU";
		int opcion = 0;
		do {
			
		
		System.out.println("Introduce");
		String palabra=in.next();
		StringBuffer s12=new StringBuffer(palabra);
		for (int i = 0; i < s12.length(); i++) {
			if ((caracteresNodeseados.indexOf(s12.charAt(i)))>=0) {
				//System.out.println(palabra.charAt(i));
				ascii=(int)s12.charAt(i);
				System.out.println(i);    //System.out.println(ascii);   d97105id  d97105avid
				String asciiString = String.valueOf(ascii);
				s12.replace(i,i+1,asciiString);
			}

		}
		palabra=s12.toString();
		System.out.println("El resultado es "+palabra);
		System.out.println("Para salir pulse 1");
		opcion=in.nextInt();
		} while (opcion != 1);

	}
}

//9111117151eiou   71711101911105   
 





	//ToString