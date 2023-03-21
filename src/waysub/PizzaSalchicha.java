package waysub;

/**
 * Clase que representa una pizza salchicha. Implementa los metodos de la interfaz Pizza
 * @author debian
 *
 */

public class PizzaSalchicha implements Pizza {
	
	/**
	 * Descripcion de la pizza. Esta' definida por el tipo de queso, el tipo de carne, y el tipo de masa. 
	 */
	public String descripcion = "Pizza desconocida.";


	public PizzaSalchicha() {
		 descripcion = "Pizza Salchicha";
	}
	
	@Override
	public double costo() {
		return 120.00;
	}

	
	@Override
	public String getDescripcion() {
		return descripcion;
	}
}
