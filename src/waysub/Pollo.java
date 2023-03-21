package waysub;

public class Pollo extends DecoradorPlatillo{

	Baguettes platillo;
	
	public Pollo(Baguettes platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Pollo"; 
	}

	@Override
	public double costo() {
		return .30 + platillo.costo();
	}

}
