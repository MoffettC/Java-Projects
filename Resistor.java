package javaCSCI;

public class Resistor extends Circuit{
	
	private int resistorCharge;
	
	public Resistor(int charge)
	{
		resistorCharge += charge;
	}
	
	public int getResistorCharge(){
		return resistorCharge;
	}
	
}
