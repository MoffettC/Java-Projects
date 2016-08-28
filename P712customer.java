package javaCSCI;
/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework P7.12
 * 3/10/16
 */
public class P712customer {

	private String customerName;
	private double amountPaid;
	
	public P712customer(String name, double amount){
		customerName = name;
		amountPaid = amount;
	}
	
	public double getAmountPaid(){
		return amountPaid;
	}
	
	public String getCustomer(){
		return customerName;
	}

}
