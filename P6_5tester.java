package test;
import java.util.Scanner;

public class P6_5tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		P6_5 prime = new P6_5();
		
		System.out.printf("Enter number to find primes up to: ");
		int total = in.nextInt();
		prime.nextPrime(total);
		
	}

}
