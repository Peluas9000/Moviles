package repaso.ej4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainListaTareas {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero =0;
		do {
		ArrayList<ListaTareas> lista=new ArrayList<ListaTareas>();
		System.out.println("1. Agregar una nueva tarea. Debe añadir una nueva tarea a la lista de tareas.\r\n"
				+ "2. Eliminar una tarea (por su número de lista). Debe eliminar la tarea que ocupa el lugar que\r\n"
				+ "se le indique de la lista. Realiza las validaciones que consideres oportunas.\r\n"
				+ "3. Buscar una tarea por prioridad.\r\n"
				+ "4. Buscar una tarea por descripción.\r\n"
				+ "5. Buscar una tarea por estado (completada).\r\n"
				+ "6. Mostrar todas las tareas. Debe mostrar todas las tareas por consola.\r\n"
				+ "7. Salir del programa. Sale de la aplicación.");
		 numero=entrada.nextInt();
		
		
				switch(numero) {
				case 1:
					System.out.println("Dime la tarea que hay que hacer");
					String descripcion=entrada.next();
					
					System.out.println("Dime nivel de prioridad");
					int prioridad=entrada.nextInt();
					
					System.out.println("Dime si esta completada o no ");
					boolean completada=entrada.nextBoolean();
				
					
					ListaTareas l1=new ListaTareas(descripcion, prioridad, completada);
					lista.add(l1);
					
					for(ListaTareas tareas:lista) {
						System.out.println(tareas);
					}
					break;
					
				case 2:
					System.out.println("Dime la posicion de la  tarea a eliminar");
					int posicion=entrada.nextInt();
					lista.remove(posicion);
					break;
				case 3:
					System.out.println("Dime la tarea a buscar por prioridad");
					int prioridad_tarea=entrada.nextInt();
					for(ListaTareas t:lista) {
						if(t.getPrioridad()==prioridad_tarea) {
							System.out.println(t);
						}
					}
					break;
				case 4:
					System.out.println("Dime la tarea a buscar por descripcion");
					String descripcion_tarea=entrada.next();
					for(ListaTareas t:lista) {
						if((t.getDescripcion()).equals(descripcion_tarea)) {
							System.out.println(t);
						}
					}
					break;
				case 5:
					System.out.println("Dime la tarea a buscar por estado de la tarea");
					boolean completado_tarea=entrada.hasNext();
					for(ListaTareas t:lista) {
						if(t.isCompletada()==completado_tarea) {
							System.out.println(t);
						}
					}
					break;
				case 6:
					System.out.println("Aqui estan todas las tareas");
					 int tarea=1;
					for(ListaTareas l:lista) {
						System.out.println(l);
						
					}
					break;
				case 7:
					System.out.println("Gracias por utilizar nuestro tier list de tareas");
					System.out.println("Salida exitosa del programa");
					break;

				}}while(numero!=7);
	}
	

}
