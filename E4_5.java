package javaCSCI;

import java.util.Scanner;
/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework E4.5
 * 2/18/16
 */
public class E4_5 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter num 1: ");
		double number1 = in.nextDouble();
		System.out.print("Etner num 2: ");
		double number2 = in.nextDouble();
		
		System.out.printf("Sum: %15.0f\n", (number1 + number2));
		System.out.printf("Difference: %8.0f\n", (number1 - number2));
		System.out.printf("Product: %11.0f\n", (number1 * number2));
		System.out.printf("Average: %14.2f\n", ((number1 + number2)/2));
		System.out.printf("Distance: %10.0f\n", Math.abs(number1 + number2));
		System.out.printf("Max: %15.0f\n", Math.max(number1, number2));
		System.out.printf("Min: %15.0f\n", Math.min(number1, number2));
	}
}
