package model;

public class ClassicCar extends Carros{

	public ClassicCar(String m) {
		super(m);
	}

	@Override
	public String Acelera() {
		return "Vruum vrum vruuum";
		
	}

	@Override
	public String Freia() {
		return "iiiii";
		
	}

}
