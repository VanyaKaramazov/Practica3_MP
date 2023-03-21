package waysub;

/*
 * Clase que representa el decorador Jitomate. Sobreescribe los metodos de Baguettes
 */


public class Jitomate extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Jitomate(Baguettes platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Jitomate"; 
	}

	@Override
	public double costo() {
		return .15 + platillo.costo();
	}

}