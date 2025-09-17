package repaso.ej4;

public class ListaTareas {

	private String descripcion;
	private int prioridad;
	private boolean completada;

	public ListaTareas(String descripcion, int prioridad, boolean completada) {
		super();
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.completada = completada;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public boolean isCompletada() {
		return completada;
	}

	public void setCompletada(boolean completada) {
		this.completada = completada;
	}

	@Override
	public String toString() {
		return "ListaTareas [descripcion=" + descripcion + ", prioridad=" + prioridad + ", completada=" + completada
				+ "]";
	}

}
