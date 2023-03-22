package waysub;
//*CLase que representa un baguette y sobresescribe el metodo costo
public class Baguette implements Baguettes {
	
	
	public double costo() {
		return 40;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Baguette";
	}

}
