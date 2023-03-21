package waysub;

/*
 * Clase que representa el decorador PJamon. Sobreescribe los metodos de Platillos
 */


public class Jamon extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Jamon(Baguettes platillo) {
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
