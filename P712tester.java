package test;

import java.util.Scanner;
/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework P7.12
 * 3/10/16
 */
public class P712tester {

	public static void main(String[] args) {
		
		boolean endOfList = false;
		P712  newCustomerList = new P712();
		Scanner in = new Scanner(System.in);
				
		while (endOfList == false){
			System.out.printf("Input customer name(Enter 0 to quit): ");
			String name = in.next();
			if (name.equals("0")){
				endOfList = true;
				break;
			}
			System.out.printf("Input customer amount paid: ");
			double paid = in.nextDouble();
			 newCustomerList.addSale(name, paid);
		}
		System.out.println("Name of best customer!: " + newCustomerList.nameOfBestCustomer());
		
	}

}
