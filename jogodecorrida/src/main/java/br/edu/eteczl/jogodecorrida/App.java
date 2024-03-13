package br.edu.eteczl.jogodecorrida;
import model.Carros;

import java.util.ArrayList;

import model.CarroSport;
import model.MuscleCar;
import model.ClassicCar;
import model.Corrida;

public class App 
{
    public static void main( String[] args )
    {   
    	//Carros da classe carros esportivos
    	Carros cs1 = new CarroSport("Ferrari California");
    	Carros cs2 = new CarroSport("Lamborguine Gallardo");
    	Carros cs3 = new CarroSport("Porshe 911");
    	
    	//Carros da classe muscle car
    	Carros mc1 = new MuscleCar("Ford Mustang");
    	Carros mc2 = new MuscleCar("Chevrolet Camaro");
    	Carros mc3 = new MuscleCar("Dodge Challenger");
    	
    	//Carros da classe classicos
    	Carros cc1 = new ClassicCar("Toyota Supra");
    	Carros cc2 = new ClassicCar("Volkswagen Golf");
    	Carros cc3 = new ClassicCar("Nissan GT-R");
        
        ArrayList<Carros> participantes = new ArrayList();
        participantes.add(cc1);
        participantes.add(mc1);
        participantes.add(cs1);
        participantes.add(cc2);
        participantes.add(mc2);
        participantes.add(cs2);
        participantes.add(cc3);
        participantes.add(mc3);
        participantes.add(cs3);
        
        new Corrida(participantes).startCorrida();
    }
  
}
