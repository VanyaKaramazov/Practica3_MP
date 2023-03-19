package waysub;

public class WaySub {

	public static void main(String[] args) {
		Platillos platillo = new Baguette(); 
		System.out.println(platillo.getDescripcion() + " $" + platillo.costo());
		//Ordenamos un baguette e imprimimos su descripcion
		
		Platillos platillo1 = new Baguette(); 
		platillo1 = new Catsup(platillo1);
		System.out.println(platillo1.getDescripcion() + " $" + platillo1.costo());
	}

}
