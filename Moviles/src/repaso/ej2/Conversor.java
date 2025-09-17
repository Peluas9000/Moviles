package repaso.ej2;

import java.util.Scanner;

public class Conversor {
	

	public static void main(String[] args) throws ErrorException {
		int numero=0;
		do {
			Scanner entrada=new Scanner(System.in);
			System.out.println("1. Metros a Centímetros\r\n"
					+ "2. Kilogramos a Gramos\r\n"
					+ "3. Euros a Dólares (utiliza un tipo de cambio fijo, 1 EUR = 1.08 USD)\r\n"
					+ "4. Salir");
			numero=entrada.nextInt();
			
			if(numero<0){
				numero=4;
				throw new ErrorException("El numero es negativo");
			
				
			}
			
			 
			
		switch(numero) {
		case 1:
			System.out.println("Dime cuantos metros para cambiar a centimetros");
			int metros=entrada.nextInt();
			
			System.out.println(metros+" metros son "+metros*100+" centimetros");
			break;
		case 2:
			System.out.println("Dime cuantos kilogramos para pasar a gramos ");
			double kg=entrada.nextDouble();
			System.out.println(kg+" kilogramos son "+kg*1000+" gramos");
			
		case 3:
			System.out.println("Dime cuantos euros para convertir en dolares ");
			double euro=entrada.nextDouble();
			System.out.println(euro+"euros son "+euro*1.08 +" dolares");
		case 4:
			System.out.println("Gracias por usar nuestro conversor");
		}
		}while(numero!=4);
		
	
	
	}
}
