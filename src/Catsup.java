package src;

/*
 * Clase que representa el decorador Catsup. Sobreescribe los metodos de PBaguettes
 */


public class Catsup extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Catsup(Baguettes platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Catsup"; 
	}

	@Override
	public double costo() {
		return 5 + platillo.costo();
	}

}
