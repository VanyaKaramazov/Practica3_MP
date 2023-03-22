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
		return platillo.getDescripcion() + ", Mayonesa"; 
	}

	@Override
	public double costo() {
		return 5 + platillo.costo();
	}

}
