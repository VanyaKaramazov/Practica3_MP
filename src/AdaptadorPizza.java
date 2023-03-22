package src;



/**
 * Clase que adapata las pizzas para que puedan usar los metodos
 * de la interface Baguettes. Implementa a Baguettes 
 * @author debian
 *
 */

public class AdaptadorPizza implements Baguettes  {
	
	Pizza pizza;
	
	public AdaptadorPizza(Pizza pizza) {
		this.pizza = pizza; 
	}
	
	/**
	 * regresa el costo total de la pizza
	 */
	public double costo() {
		return pizza.costo();
	}
	
	
	/**
	 * Asigna uno o los dos tipos de queso a cada pizza
	 * y los regresa para ser mostrados en la descripcion 
	 * como ingredientes de la pizza, al igual que se hace 
	 * con los baguettes.
	 * @return
	 */
	public String tipoQueso() {
		if(pizza.getDescripcion() == "Pizza Hawaiana") {
			return "Queso Cheddar";
		} else if(pizza.getDescripcion() == "Pizza Doble Queso" || pizza.getDescripcion() == "Pizza Especial" ) {
			return "Queso Cheddar, Queso Manchego";
		} else 
			return "Queso Manchego";
	}

	/**
	 * Asigna uno o hasta tres tipos de carne a cada pizza
	 * y los regresa para ser mostrados en la descripcion 
	 * como ingredientes de la pizza, al igual que se hace 
	 * con los baguettes.
	 * @return
	 */
	public String tipoCarne() {
		if(pizza.getDescripcion() == "Pizza Hawaiana") {
			return "Jamon";
		}else if(pizza.getDescripcion() == "Pizza Especial") {
			return "Jamon, Salchicha";
		}else if(pizza.getDescripcion() == "Pizza Doble Queso") {
			return "";
		}else if(pizza.getDescripcion() == "Pizza de la Casa") {
		return "Pollo";
		}
		else return "Salchicha";
		
	}


	/**
	 * Asigna un tipo de masa a cada pizza
	 * y lo regresa para ser mostrado en la descripcion 
	 * como ingrediente de la pizza, al igual que se hace 
	 * con los baguettes.
	 * @return
	 */
	public String tipoMasa() {
		if (pizza.getDescripcion() == "Pizza Hawaiana" || pizza.getDescripcion() == "Pizza Especial" || pizza.getDescripcion() == "Pizza Salchicha" ) {
			return "Masa gruesa";
		}else return "Masa delgada";
		
	}
	

	/**
	 * Metodo que regresa la descripcion de la pizza adaptada 
	 * a la descripcion de los baguettes.
	 */
	public String getDescripcion() {
	
		return  pizza.getDescripcion() + ", " + tipoQueso() + ", " + tipoCarne() + ", " + tipoMasa(); 
	}

}
