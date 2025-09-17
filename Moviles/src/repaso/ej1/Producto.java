package repaso.ej1;

public class Producto {

	private String nombre;
	private double precio;
	private int stock;

	// Constructor
	public Producto(String nombre, double precio, int stock) {
		if (precio < 0) {
			System.out.println("El precio es negativo ");
		} else if (stock < 0) {
			System.out.println("El stock no puede ser negativo");
		} else {
			this.nombre = nombre;
			this.precio = precio;
			this.stock = stock;
		}

	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}

}
