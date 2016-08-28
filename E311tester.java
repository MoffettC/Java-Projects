package javaCSCI;

public class E311tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E311 tester = new E311("Chris", 10000);
		System.out.println(tester.getName());
		System.out.println(tester.getSalary());
		tester.raiseSalary(.20);
		System.out.println(tester.getName());
		System.out.println(tester.getSalary());
		tester.raiseSalary(20);
		System.out.println(tester.getName());
		System.out.println(tester.getSalary());
	}

}
