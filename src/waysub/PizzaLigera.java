package waysub;

/**
 * Clase que representa una pizza Ligera. Implementa los metodos de la interfaz Pizza
 * @author debian
 *
 */

public class PizzaLigera implements Pizza {
	
	/**
	 * Descripcion de la pizza. Esta' definida por el tipo de queso, el tipo de carne, y el tipo de masa. 
	 */
	public String descripcion = "Pizza desconocida.";


	public PizzaLigera() {
		 descripcion = "Pizza Ligera";
	}
	
	@Override
	public double costo() {
		return 100.00;
	}

	
	@Override
	public String getDescripcion() {
		return descripcion;
	}


}