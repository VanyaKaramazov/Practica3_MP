package waysub;

/**
 * Interface de las pizzas del restaurante Pizzas de Don Cangrejo
 * @author Ivan Cabrera
 * Deben 
 *
 */

public interface Pizza {
	
	
	/**
	 * @return costo de la pizza
	 */
	public double costo();
	
	
	/**
	 * @return descripcion de la pizza
	 */
	public String getDescripcion();
	
	/**
	 * 
	 * @return el tipo de queso de la pizza \(Cheddar y no Manchego) o (Manchego y no Cheddar)\
	 */
	public String tipoQueso();
	
	/**
	 * 
	 * @return el tipo de carne de la pizza: Salchica, Pollo o Jamon
	 */
	public String tipoCarne();
	
	
	/**
	 * 
	 * @return el tipo de masa de la pizza: Gruesa o Delgada
	 */
	public String tipoMasa();
	
}
