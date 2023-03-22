package waysub;

/*
 * Clase que representa el decorador Pepperoni Sobreescribe los metodos de Baguettes
 */


public class Pepperoni extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Pepperoni(Baguettes platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Pepperoni"; 
	}

	@Override
	public double costo() {
		return 25 + platillo.costo();
	}

}
