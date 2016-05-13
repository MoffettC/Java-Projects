package test;

import java.util.Scanner;

public class E11_13tester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total;
		int checks = 3;
		int i = 0;
		
		Scanner in = new Scanner(System.in);
		E11_13 thing = new E11_13();
		
	while (i < 3){
		try{
			System.out.println("Please enter first digit to add");
			total = thing.Add(in.next());
			System.out.println("Total: "+ total);
			break;
		}
		catch (NumberFormatException e){
			if (i == 0){
				System.out.println("Please enter valid data");
			} else if (i == 1){
				System.out.println("Please enter valid data. Last Try!");
			} else {
				System.out.println("No more tries. Exiting");
			}
			i++;
		}		
	}
	
	i = 0;
	while (i < 3){
		try{
			System.out.println("Please enter second digit to add");
			total = thing.Add(in.next());
			System.out.println("Total: "+ total);
			break;
		}
		catch (NumberFormatException e){
			if (i == 0){
				System.out.println("Please enter valid data");
			} else if (i == 1){
				System.out.println("Please enter valid data. Last Try!");
			} else {
				System.out.println("No more tries. Exiting");
			}
			i++;
		}		
	}
	
	}
	
		
}



