package repaso.ej4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainListaTareas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		ArrayList<ListaTareas> lista = new ArrayList<ListaTareas>();

		do {
			System.out.println("1. Agregar una nueva tarea. Debe añadir una nueva tarea a la lista de tareas.\r\n"
					+ "2. Eliminar una tarea (por su número de lista). Debe eliminar la tarea que ocupa el lugar que\r\n"
					+ "se le indique de la lista. Realiza las validaciones que consideres oportunas.\r\n"
					+ "3. Buscar una tarea por prioridad.\r\n" + "4. Buscar una tarea por descripción.\r\n"
					+ "5. Buscar una tarea por estado (completada).\r\n"
					+ "6. Mostrar todas las tareas. Debe mostrar todas las tareas por consola.\r\n"
					+ "7. Salir del programa. Sale de la aplicación.");
			numero = entrada.nextInt();
			GestionTareas g = new GestionTareas(lista);

			switch (numero) {
			case 1:
				try {
					g.agregarTarea();
				} catch (InputMismatchException e) {
					System.out.println("Debes introducir un número válido.");
					entrada.nextLine(); // limpiar el buffer
					continue; // vuelve al menú
				}

				break;

			case 2:
				try {
					g.eliminarTarea();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Debes introducir una posicion valida .");
					entrada.nextLine(); // limpiar el buffer
					System.out.println("El tamaño de la lista es " + lista.size());
					continue; // vuelve al menú
				}
				break;
			case 3:
				try {
					g.buscarPorPrioridad();
				} catch (InputMismatchException e) {
					
				}
				break;
			case 4:
				g.buscarPorDescripcion();
				break;
			case 5:
				g.buscarPorEstado();
				break;
			case 6:
				g.mostrarTodo();
				break;
			case 7:
				System.out.println("Gracias por utilizar nuestro tier list de tareas");
				System.out.println("Salida exitosa del programa");
				break;

			}
		} while (numero != 7);
	}

}
