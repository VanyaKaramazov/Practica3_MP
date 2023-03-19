package waysub;
/**
 * @author debian
 *	Clse abstracta que representa los platillos de WaySub, que al inicio seran solo baguettes y 
 *  posteriormente se incluiran las pizzas.
 *  Tiene un atributo Descricion y al menos dos metodos: getDescripcion y costo
 */
public abstract class Platillos {
	String descripcion = "Platillo desconocido";
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public abstract double costo();
}