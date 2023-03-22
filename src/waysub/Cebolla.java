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
		return platillo.getDescripcion() + ", Cebolla"; 
	}

	@Override
	public double costo() {
		return 7 + platillo.costo();
	}

}
