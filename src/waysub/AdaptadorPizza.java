package waysub;

public class AdaptadorPizza implements Baguettes  {
	
	Pizza pizza;
	
	public AdaptadorPizza(Pizza pizza) {
		this.pizza = pizza; 
	}
	
	
	public double costo() {
		return pizza.costo();
	}
	
	
	
	public String tipoQueso() {
		if(pizza.getDescripcion() == "Pizza Hawaiana") {
			return "Queso Cheddar";
		} else if(pizza.getDescripcion() == "Pizza Doble Queso" || pizza.getDescripcion() == "Pizza Especial" ) {
			return "Queso Cheddar, Queso Manchego";
		} else 
			return "Queso Manchego";
	}


	public String tipoCarne() {
		if(pizza.getDescripcion() == "Pizza Hawaiana") {
			return "Jamon";
		}else if(pizza.getDescripcion() == "Pizza Especial") {
			return "Jamon, Salchicha";
		}else if(pizza.getDescripcion() == "Pizza Doble Queso") {
			return "";
		}else if(pizza.getDescripcion() == "Pizza Ligera") {
		return "Pollo";
		}
		else return "Salchicha";
		
	}


	public String tipoMasa() {
		if (pizza.getDescripcion() == "Pizza Hawaiana" || pizza.getDescripcion() == "Pizza Especial" || pizza.getDescripcion() == "Pizza Salchicha" ) {
			return "Masa gruesa";
		}else return "Masa delgada";
		
	}
	

	public String getDescripcion() {
		
		String descripcionAdaptada = pizza.getDescripcion() + ", " + tipoQueso() + ", " + tipoCarne() + ", " + tipoMasa();
	
		return  descripcionAdaptada; 
	}

}
