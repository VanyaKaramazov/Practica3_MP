package waysub;

/**
 * Clase que representa una pizza de la casa. Implementa los metodos de la interfaz Pizza
 * @author debian
 *
 */

public class PizzaCasa implements Pizza {
	
	/**
	 * Descripcion de la pizza. Esta' definida por el tipo de queso, el tipo de carne, y el tipo de masa. 
	 */
	public String descripcion = "Pizza desconocida.";


	public PizzaCasa() {
		 descripcion = "Pizza de la Casa";
	}
	
	@Override
	public double costo() {
		return 160.00;
	}

	
	@Override
	public String getDescripcion() {
		return descripcion;
	}

}
