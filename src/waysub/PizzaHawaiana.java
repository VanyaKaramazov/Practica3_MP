package waysub;

/**
 * Clase que representa una pizza Hawaiana. Implementa los metodos de la interfaz Pizza
 * @author debian
 *
 */

public class PizzaHawaiana implements Pizza {
	
	/**
	 * Nombre de la pizza. 
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


}
