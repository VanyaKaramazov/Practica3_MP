package waysub;

/**
 * Clase que representa una pizza Especial. Implementa los metodos de la interfaz Pizza
 * @author debian
 *
 */

public class PizzaEspecial implements Pizza {
	
	/**
	 * Descripcion de la pizza. Esta' definida por el tipo de queso, el tipo de carne, y el tipo de masa. 
	 */
	public String descripcion = "Pizza desconocida.";


	public PizzaEspecial() {
		 descripcion = "Pizza Especial";
	}
	
	@Override
	public double costo() {
		return 230.00;
	}

	
	@Override
	public String getDescripcion() {
		return descripcion;
	}


}