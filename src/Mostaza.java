package src;

/*
 * Clase que representa el decorador Mostaza. Sobreescribe los metodos de Baguettes
 */


public class Mostaza extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Mostaza(Baguettes platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Mostaza"; 
	}

	@Override
	public double costo() {
		return 5 + platillo.costo();
	}

}
