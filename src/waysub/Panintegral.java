package waysub;

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
		return platillo.getDescripcion() + ", Jitomate"; 
	}

	@Override
	public double costo() {
		return .30 + platillo.costo();
	}

}