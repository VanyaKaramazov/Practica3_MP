package waysub;

public class AdaptadorPizza implements Baguettes  {

	
	Pizza pizza;
	
	public AdaptadorPizza(Pizza pizza) {
		this.pizza = pizza; 
		
		
	}
	
	
	
	
	
	public double costo() {
		return pizza.costo();
	}
	

	public String getDescripcion() {
		
		String descripcionAdaptada = pizza.getDescripcion() + ", " + pizza.tipoQueso() + ", " + pizza.tipoCarne() + ", " + pizza.tipoMasa();
	
		return  descripcionAdaptada; 
	}

}
