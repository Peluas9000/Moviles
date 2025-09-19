package repaso.ej4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionTareas {
	ArrayList<ListaTareas> lista=new ArrayList<ListaTareas>();

	
	public GestionTareas(ArrayList<ListaTareas> lista) {
		super();
		this.lista = lista;
	}

	public void agregarTarea(){
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dime la tarea que hay que hacer");
		String descripcion=entrada.next();
		
		System.out.println("Dime nivel de prioridad");
		int prioridad=entrada.nextInt();
		
		System.out.println("Dime si esta completada o no ");
		boolean completada=entrada.nextBoolean();
	
		
		ListaTareas l1=new ListaTareas(descripcion, prioridad, completada);
		lista.add(l1);
	}
	
	public void eliminarTarea() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dime la posicion de la  tarea a eliminar");
		int posicion=entrada.nextInt();
		lista.remove(posicion);
	}
	public void buscarPorPrioridad() {
		Scanner entrada=new Scanner(System.in);

		System.out.println("Dime la tarea a buscar por prioridad");
		int prioridad_tarea=entrada.nextInt();
		for(ListaTareas t:lista) {
			if(t.getPrioridad()==prioridad_tarea) {
				System.out.println(t);
			}
		}
		
	}
	
	public void buscarPorDescripcion() {
		Scanner entrada=new Scanner(System.in);

		System.out.println("Dime la tarea a buscar por descripcion");
		String descripcion_tarea=entrada.next();
		for(ListaTareas t:lista) {
			if((t.getDescripcion()).equals(descripcion_tarea)) {
				System.out.println(t);
			}
		}
	}
	
	public void buscarPorEstado() {
		Scanner entrada=new Scanner(System.in);

		System.out.println("Dime la tarea a buscar por estado de la tarea");
		boolean completado_tarea=entrada.nextBoolean();
		for(ListaTareas t:lista) {
			if(t.isCompletada()==completado_tarea) {
				System.out.println(t);
			}
		}
	}
	public void mostrarTodo() {
		System.out.println("Aqui estan todas las tareas");
		
		for(ListaTareas l:lista) {
			System.out.println(l);
			
		}
	}

	public ArrayList<ListaTareas> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ListaTareas> lista) {
		this.lista = lista;
	}
	
	
}
