package waysub;

/*
 * Clase que representa el decorador PJamon. Sobreescribe los metodos de Baguettes
 */


public class Jamon extends DecoradorPlatillo{

	/**
	 * Instancia de Baguettes
	 */
	Baguettes platillo;
	
	public Jamon(Baguettes platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Jamon"; 
	}

	@Override
	public double costo() {
		return 15 + platillo.costo();
	}

}
