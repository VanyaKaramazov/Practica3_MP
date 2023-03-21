package waysub;

/*
 * Clase que representa el decorador Mostaza. Sobreescribe los metodos de Platillos
 */


public class Mostaza extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Mostaza(Baguettes platillo) {
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
