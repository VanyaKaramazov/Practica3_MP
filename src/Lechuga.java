package src;

/*
 * Clase que representa el decorador Lechuga. Sobreescribe los metodos de Baguettes
 */


public class Lechuga extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Lechuga(Baguettes platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Lechuga"; 
	}

	@Override
	public double costo() {
		return 10 + platillo.costo();
	}

}
