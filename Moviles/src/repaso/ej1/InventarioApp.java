package repaso.ej1;

import java.util.ArrayList;

public class InventarioApp {
	public static void main(String[] args) {
		double precio_total=0;
		ArrayList<Producto> productos=new ArrayList<Producto>();
		Producto p1=new Producto("Iphone 17",1299.90,200);
		Producto p2=new Producto("Macarrones",3.05,20);
		Producto p3=new Producto("Samsun s25",1000.99,1);
		Producto p4=new Producto("PC",2000,15);
		Producto p5=new Producto("Pantalon",15.99,20);
		
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		
		for(Producto p:productos) {
		System.out.println("Producto:"+"["+p.getNombre()+"]");
		System.out.println("Precio:"+"["+p.getPrecio()+"]");
		System.out.println("Stock:"+"["+p.getStock()+"]");
			
		}
		
		for(Producto pr:productos) {
		double precio_stock=pr.getPrecio()*pr.getStock();
		precio_total+=precio_stock;
		}
		
		System.out.println("El valor total es de "+ precio_total+" euros");
		
		
		
	}

}
