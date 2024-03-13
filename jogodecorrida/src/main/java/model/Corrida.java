package model;
import java.util.ArrayList;
import java.util.Iterator;

public class Corrida {
	ArrayList<Carros> automoveis = new ArrayList();
	
	public Corrida(ArrayList<Carros> autos) {
		this.automoveis = autos;
	}
	
	public void startCorrida() {
		for(Carros a : this.automoveis) {
			System.out.println(a.modelo + ": "+ a.Acelera());
		}
		
	}
}
