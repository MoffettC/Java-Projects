package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P11_9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter file location: ");
		Scanner in = new Scanner(System.in);
		getSales(in.nextLine());
	}
	
	
	public static void getSales(String file){
		File inputFile = new File(file);
		//File inputFile = new File("test/sales.txt");
		double totalDinner = 0;
		double totalLodging = 0;
		double totalConference = 0;
		
		try (Scanner in = new Scanner(inputFile)){
			
			while (in.hasNextLine()){
				
				String str = in.nextLine();
				Scanner lineScan = new Scanner(str);
				
				String entry[] = str.split(";");
				String name = entry[0];
				System.out.printf("%s ", name);
				
				String event = entry[1];
				System.out.printf("%s ", event);
				
				String amountString = entry[2];
				System.out.printf("%s ", amountString);
				double cost = Double.parseDouble(amountString);
						
				String date = entry[3];
				System.out.printf("%s \n\n", date);
				
				if (event.equalsIgnoreCase("Dinner")){
					totalDinner += cost;
				} else if (event.equalsIgnoreCase("Conference")){
					totalConference += cost;
				} else if (event.equalsIgnoreCase("Lodging")){
					totalLodging += cost;
				}
			}
			
			System.out.println("Total Dinner:     " + String.format("%8.2f", totalDinner));
			System.out.println("Total Conference: " + String.format("%8.2f", totalConference));
			System.out.println("Total Lodging:    " + String.format("%8.2f", totalLodging));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("");
			System.out.println("File unable to be located, please enter valid file location");
			e.printStackTrace();
		} catch (NumberFormatException e){
			System.out.println("");
			System.out.println("Incorrect cost format. Please enter correct cost numbers");
		}	
		
		

		

	}
}


