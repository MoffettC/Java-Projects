package javaCSCI;

/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Car Lab
 * Homework E3.12
 * 2/22/16
 */

public class E312Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E312 myCar = new E312(10);
		myCar.addGas(100);
		myCar.drive(500);
		System.out.println("Expected: 50 gal");
		System.out.println(myCar.gasLeft() + " Gallons left\n");
		myCar.addGas(100);
		myCar.drive(500);
		System.out.println("Expected: 100 gal");
		System.out.println(myCar.gasLeft() + " Gallons left\n");
		myCar.drive(1000000);
		System.out.println("Expected: 100 gal, cant drive that far");
		System.out.println(myCar.gasLeft() + " Gallons left");
	}

}
