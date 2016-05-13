package test;

public class E11_13 {

	private double input;
	private double sum = 0;


	public double Add(String x) throws NumberFormatException{

		input = Double.parseDouble(x);

		return sum += input;
	}

	
}

