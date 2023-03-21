package waysub;

/*
 * Clase que representa el decorador Lechuga. Sobreescribe los metodos de Platillos
 */


public class Lechuga extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Lechuga(Baguettes platillo) {
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
