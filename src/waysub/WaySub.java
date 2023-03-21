package waysub;

public class WaySub {

	public static void main(String[] args) {
		int idPizza = 0;
		Baguettes platillo = new Baguette(); 
		System.out.printf(platillo.getDescripcion()+ " $ %.2f" + " \n", platillo.costo() );
		//Ordenamos un baguette e imprimimos su descripcion
		
		Baguettes platillo0 = new Baguette(); 
		platillo0 = new Catsup(platillo0);
		System.out.printf(platillo0.getDescripcion()+ " $ %.2f" + " \n", platillo0.costo());
		
		Baguettes platillo1 = new Baguette(); 
		platillo1 = new Catsup(platillo1);
		platillo1 = new Mostaza(platillo1);
		platillo1 = new Pollo(platillo1);
		System.out.printf(platillo1.getDescripcion()+ " $ %.2f" + " \n", platillo1.costo());
		
		Pizza pizza1 = new PizzaHawaiana();
		System.out.println(pizza1.getDescripcion() + " $ "+ pizza1.costo());
		
		
		PizzaHawaiana pizza2 = new PizzaHawaiana();
		idPizza = 0;
		Baguettes pizza2A = new AdaptadorPizza(pizza2); 
		System.out.printf(pizza2A.getDescripcion()+ " $ %.2f" + " \n", pizza2A.costo() );
		
		PizzaDobleQueso pizza3 = new PizzaDobleQueso();
		idPizza = 0;
		Baguettes pizza3A = new AdaptadorPizza(pizza3); 
		System.out.printf(pizza3A.getDescripcion()+ " $ %.2f" + " \n", pizza3A.costo() );
		
		PizzaLigera pizza6 = new PizzaLigera();
		idPizza = 0;
		Baguettes pizza6A = new AdaptadorPizza(pizza6); 
		System.out.printf(pizza6A.getDescripcion()+ " $ %.2f" + " \n", pizza6A.costo() );
		
		PizzaSalchicha pizza5 = new PizzaSalchicha();
		idPizza = 0;
		Baguettes pizza5A = new AdaptadorPizza(pizza5); 
		System.out.printf(pizza5A.getDescripcion()+ " $ %.2f" + " \n", pizza5A.costo() );
		
		PizzaEspecial pizza4 = new PizzaEspecial();
		idPizza = 0;
		Baguettes pizza4A = new AdaptadorPizza(pizza4); 
		System.out.printf(pizza4A.getDescripcion()+ " $ %.2f" + " \n", pizza4A.costo() );
	}

}


