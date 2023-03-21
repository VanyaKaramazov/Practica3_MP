package waysub;

/*
 * Clase que representa el decorador PanAvena. Sobreescribe los metodos de Platillos
 */


public class PanAvena extends DecoradorPlatillo{

	Baguettes platillo;
	
	public PanAvena(Baguettes platillo) {
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
