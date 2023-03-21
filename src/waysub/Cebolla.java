package waysub;

/*
 * Clase que representa el decorador Cebolla. Sobreescribe los metodos de Platillos
 */


public class Cebolla extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Cebolla(Baguettes platillo) {
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
