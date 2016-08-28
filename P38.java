package javaCSCI;
/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Battery Lab
 * Homework P3.8
 * 2/22/16
 */
public class P38 {
	
	private double batteryCapacity;
	private double originalCapacity;
	
	public P38(double capacity){
		batteryCapacity = capacity;
		originalCapacity = capacity;
	}
	
	public void drain(double amount){
		if (0 <= batteryCapacity - amount){
		batteryCapacity -= amount;
		} else{
			batteryCapacity = 0;
		}
	}
	
	public void charge(){
		batteryCapacity = originalCapacity;
	}
	
	public double getRemainingCapacity(){
		return batteryCapacity;
	}


}
