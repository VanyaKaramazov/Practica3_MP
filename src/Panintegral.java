package src;
/*
 * Clase que representa el decorador PanIntegral Sobreescribe los metodos de Baguettes
 */


public class Panintegral extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Panintegral(Baguettes platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Pan Integral"; 
	}

	@Override
	public double costo() {
		return 20 + platillo.costo();
	}

}