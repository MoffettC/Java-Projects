package javaCSCI;
import java.util.Scanner;

/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework P5.4
 * 2/25/16
 */

public class P5_4tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		P5_4 converter = new P5_4();
		
		System.out.printf("Enter starting unit (floz, gal, oz, lbs, in, ft, mi): ");
		String fromUnit = in.nextLine();
		converter.fromUnit(fromUnit);
		
		System.out.printf("Enter ending unit (ml, L, g, kg, mm, cm, m ,km): ");
		String toUnit = in.nextLine();
		converter.toUnit(toUnit);

		System.out.printf("Enter amount of starting units: ");
		Double value = in.nextDouble();
		System.out.printf("Conversion Units: ");
		System.out.println(converter.unitConverter(value));
	}

}
