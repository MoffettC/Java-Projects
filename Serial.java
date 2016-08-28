package javaCSCI;

import java.util.ArrayList;

public class Serial extends Circuit{

	private ArrayList<Circuit> serialCircuit = new ArrayList<Circuit>();

	
	public void add(Circuit circuitOrResistor){
		Resistor r = new Resistor(0); //test Resistor
		Serial s = new Serial(); //test circuit
		serialCircuit.add(circuitOrResistor);

		if (circuitOrResistor.getClass().equals(r.getClass())){
			Resistor tempRes = (Resistor) circuitOrResistor;
			super.totalResistance += tempRes.getResistorCharge();
		} else if (circuitOrResistor.getClass().equals(s.getClass())){
			FindResistorsSerial((Serial) circuitOrResistor);	
		} else {
			FindResistorsParallel((Parallel) circuitOrResistor);	
		}
	}
	
	public void FindResistorsSerial(Serial serial){
		ArrayList<Circuit> listOfCircuits = serial.returnCircuit();
		Resistor r = new Resistor(0); //test Resistor
		Serial s = new Serial(); //test circuit
		
		for (Circuit c : listOfCircuits){
			if (c.getClass().equals(r.getClass())){
				Resistor tempRes = (Resistor) c;
				super.totalResistance += tempRes.getResistorCharge();
			} else if (c.getClass().equals(s.getClass())){
				FindResistorsSerial((Serial) c);
			} else {
				FindResistorsParallel((Parallel) c);
			}
		}
	}
	
	public void FindResistorsParallel(Parallel parallel){
		ArrayList<Circuit> listOfCircuits = parallel.returnCircuit();
		Resistor r = new Resistor(0); //test Resistor
		Serial s = new Serial(); //test circuit
		
		for (Circuit c : listOfCircuits){
			if (c.getClass().equals(r.getClass())){
				Resistor tempRes = (Resistor) c;
				super.totalResistance += tempRes.getResistorCharge();
			} else if (c.getClass().equals(s.getClass())){
				FindResistorsSerial((Serial) c);
			} else {
				FindResistorsParallel((Parallel) c);
			}
		}
	}
	
	public ArrayList<Circuit> returnCircuit(){
		return serialCircuit;
	}
	
	
}
