package waysub;

/*
 * Clase que representa el decorador PanBlanco. Sobreescribe los metodos de Baguettes
 */


public class PanBlanco extends DecoradorPlatillo{

	Baguettes platillo;
	
	public PanBlanco(Baguettes platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Pan Blanco"; 
	}

	@Override
	public double costo() {
		return .25 + platillo.costo();
	}

}