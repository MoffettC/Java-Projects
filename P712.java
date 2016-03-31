package test;
import java.util.ArrayList;
/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework P7.12
 * 3/10/16
 */
public class P712 {

	private ArrayList<P712customer> customersList = new ArrayList<P712customer>();
	private String bestCustomer;
	private double bestSelling = 0;
	
	public void addSale(String customerName, double amount){
		P712customer customer = new P712customer(customerName, amount);
		customersList.add(customer);
		setHighestPaidCustomer();
	}
	
	public void setHighestPaidCustomer(){
		for(P712customer element : customersList){
			double amount = element.getAmountPaid();
			if (amount > bestSelling){
				bestSelling = amount;
				bestCustomer = element.getCustomer();
			}
		}
	}
	
	public String nameOfBestCustomer(){
		return bestCustomer;
	}
}

