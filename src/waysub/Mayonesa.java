package waysub;

/*
 * Clase que representa el decorador Mayonesa. Sobreescribe los metodos de Baguettes
 */


public class Mayonesa extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Mayonesa(Baguettes platillo) {
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
