package javaCSCI;
import java.util.Scanner;

/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework E4.6
 * 2/18/16
 */

public class E4_6 {
	private static double inchesPerMeter = 39.37;
	private static double feetPerMeter = 3.28;
	private static double metersPerMile = 1609.34;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter meters to be converted: ");
		double number1 = in.nextDouble();
		
		System.out.printf("Meters in Inches: %15.2f\n", (number1 * inchesPerMeter));
		System.out.printf("Meters in Feet: %17.2f\n", (number1 * feetPerMeter));
		System.out.printf("Meters in Miles: %19.5f\n",(number1 / metersPerMile));

	}
}
