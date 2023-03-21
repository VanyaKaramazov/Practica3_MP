package waysub;

public class PizzaDobleQueso implements Pizza {

	/**
	 * Descripcion de la pizza. Esta' definida por el tipo de queso, el tipo de carne, y el tipo de masa. 
	 */
	public String descripcion = "Pizza desconocida.";


	public PizzaDobleQueso() {
		 descripcion = "Pizza Doble Queso";
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
