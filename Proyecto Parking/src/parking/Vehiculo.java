package parking;

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

	//ToString

}
