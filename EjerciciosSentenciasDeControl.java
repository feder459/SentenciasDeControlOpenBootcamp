//Ejercicios Sentencias de Control
public class EjerciciosSentenciasDeControl {
	char[] chars = {'n', '\u00f1'};

	public static void main(String[] args) {
		int numeroif = -5;
		int numeroWhile = 1;
		int numeroDoWhile =1;
		var estacion = "OTO\u00D1O";

        //CONDICIONALES
		if(numeroif<0) {
			System.out.println("Es negativo");
		} else if(numeroif>0) {
			System.out.println("Es positivo");
		} else if(numeroif==0) {
			System.out.println("Es igual a cero");
		}

		//WHILE
		while(numeroWhile<3) {
			System.out.println(numeroWhile);
			numeroWhile = numeroWhile + 1;
		}

		//DO-WHILE
		do {
			numeroDoWhile = numeroDoWhile + 1;
			System.out.println(numeroDoWhile);
		} while(numeroDoWhile<3);

		//FOR
		for(int numeroFor=0; numeroFor<=3; numeroFor=numeroFor+1) {
			System.out.println(numeroFor);
		}
		//SWITCH
		switch(estacion) {
		case "OTO\u00D1O":
			System.out.println("Es oto\u00F1o");
			break;
		case "INVIERNO":
			System.out.println("Es invierno");
			break;
		case "PRIMAVERA":
			System.out.println("Es primavera");
			break;
		case "VERANO":
			System.out.println("Es verano");
			break;
		default:
			System.out.println("No es una estación");
		}
	}	
}