package waysub;

public class Catsup extends DecoradorPlatillo{

	Platillos platillo;
	
	public Catsup(Platillos platillo) {
		this.platillo = platillo;
	}
	
	@Override
	public String getDescripcion() {
		return platillo.getDescripcion() + ", Catsup"; 
	}

	@Override
	public double costo() {
		return .10 + platillo.costo();
	}

}
