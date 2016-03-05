package test;

public class E311 {
	
	private String employee;
	private double salary;

	public E311(String employeeName, double currentSalary){
		employee = employeeName;
		salary = currentSalary;
	}
	
	public String getName(){
		return employee;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void raiseSalary(double byPercent){
		//Checks to see if percent is whole number or decimal and converts
		if (byPercent > 1){
			byPercent = byPercent / 100;
		}
		salary = salary + (salary * byPercent);
	}

}
