package waysub;

/**
 * Clase que representa una pizza Hawaiana. Implementa los metodos de la interfaz Pizza
 * @author debian
 *
 */

public class PizzaHawaiana implements Pizza {
	
	/**
	 * Descripcion de la pizza. Esta' definida por el tipo de queso, el tipo de carne, y el tipo de masa. 
	 */
	public String descripcion = "Pizza desconocida.";


	public PizzaHawaiana() {
		 descripcion = "Pizza Hawaiana";
	}
	
	@Override
	public double costo() {
		return 100.00;
	}

	
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String tipoQueso() {
		return "Queso Cheddar";
	}

	@Override
	public String tipoCarne() {
		return "Jamon";
	}

	@Override
	public String tipoMasa() {
		return "Masa gruesa";
	}
	
	
	

}
