package test;

/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Car Lab
 * Homework E3.12
 * 2/22/16
 */

public class E312 {
	
	private double gasTank = 0;
	private double milesDriven;
	private double maxMiles;
	private double fuelEfficiency;
	
	public E312 (double efficiency){
		fuelEfficiency = efficiency;
	}
	
	public void addGas(double gas){
		gasTank += gas;
	}
	
	public double gasLeft(){
		return gasTank;
	}
	
	public void drive(int milesDrove){
		milesDriven = milesDrove;
		maxMiles = fuelEfficiency * gasTank;
		if (milesDriven < maxMiles){
			gasTank -= (milesDriven / fuelEfficiency);
		}else{
			System.out.println("Cant drive that far, exceeded gas in tank.");
		}
	}
	
}
