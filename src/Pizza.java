package src;

/**
 * Interface de las pizzas del restaurante Pizzas de Don Cangrejo
 * @author Ivan Cabrera
 * Tiene los metodos costo y getDescripcion (se definen de forma distinta que 
 * en los baguettes)
 *
 */

public interface Pizza {
	
	
	/**
	 * 
	 * @return costo de la pizza, el costo es fijo una vez que se elije la pizza
	 */
	public double costo();
	
	
	/**
	 * @return descripcion de la pizza, es solo el nombre de la pizza
	 */
	public String getDescripcion();
	
	
	
}
