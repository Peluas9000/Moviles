package repaso.ej3;
import java.util.Random;
import java.util.Scanner;
public class GeneracionContrasenia {



	    // Método para devolver todos los caracteres posibles en un String
	    public static String obtenerCaracteres() {
	        String minusculas = "abcdefghijklmnopqrstuvwxyz";
	        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String numeros = "0123456789";
	        String simbolos = "!@#$%^&*()-_+=";
	        return minusculas + mayusculas + numeros + simbolos;
	    }

	    // Método para generar la contraseña
	    public static String generarContrasena(int longitud) {
	        String caracteres = obtenerCaracteres();
	        Random random = new Random();
	        StringBuilder contrasena = new StringBuilder();

	        for (int i = 0; i < longitud; i++) {
	            int indice = random.nextInt(caracteres.length()); 
	            contrasena.append(caracteres.charAt(indice));
	        }

	        return contrasena.toString();
	    }


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int longitud;

	        // Validación de rango
	        while (true) {
	            System.out.print("Introduce la longitud de la contraseña (8-16): ");
	            longitud = scanner.nextInt();

	            if (longitud >= 8 && longitud <= 16) {
	                break;
	            } else {
	                System.out.println(" Error: La longitud debe estar entre 8 y 16.");
	            }
	        }

	        // Generar y mostrar la contraseña
	        String contrasena = generarContrasena(longitud);
	        System.out.println(" Contraseña generada: " + contrasena);

	        scanner.close();
	    }
	
}
