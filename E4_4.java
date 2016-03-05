package test;
import java.util.Scanner;

/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework E4.4
 * 2/18/16
 */

public class E4_4 {
	static String s = "you" + "hello";
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println(3 * 5 / 2 * 5);
		
		System.out.print("Enter num 1: ");
		double number1 = in.nextDouble();
		System.out.print("Etner num 2: ");
		double number2 = in.nextDouble();
		
		System.out.print("Sum: " + (number1 + number2) + "\n");
		System.out.print("Difference: " + (number1 - number2) + "\n");
		System.out.print("Product: " + (number1 * number2) + "\n");
		System.out.print("Average: " + (number1 + number2)/2 + "\n");
		System.out.print("Distance: " + Math.abs(number1 + number2) + "\n");
		System.out.print("Max: " + Math.max(number1, number2) + "\n");
		System.out.print("Min: " + Math.min(number1, number2) + "\n");
	}
}
