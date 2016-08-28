package javaCSCI;

import java.util.Scanner;

/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework E4.3
 * 2/18/16
 */
public class E4_3 {
	

	
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number to be squared/cubed/fourthed: ");
		double number1 = in.nextDouble();
		
		System.out.print("Square: " + (number1 * number1) + "\n");
		System.out.print("Cube: " + (number1 * number1* number1) + "\n");
		System.out.print("Fourth: " + Math.pow(number1, 4) + "\n");
	}
}