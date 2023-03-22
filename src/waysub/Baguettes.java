package waysub;
/**
 * @author debian
 *	Clse abstracta que representa los platillos de WaySub, consiste de Baguettes.
 *  Tiene los metodos: getDescripcion y costo
 */
public interface Baguettes {
	
	/**
	 * Metodo que regresa la descripcion de los baguettes, que consiste de sus ingredientes
	 * y el tipo de pan.
	 * @return String
	 */
	public String getDescripcion();
	
	/**
	 * Metodo abstracto que regresa el costo del baguette. Se iran modificando
	 * segun los ingredientes que se agreguen.
	 * @return
	 */
	public abstract double costo();
}