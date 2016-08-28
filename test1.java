package javaCSCI;


public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      LastDigitDistribution dist1 = new LastDigitDistribution();
	      dist1.process(new PrimeSequence(), 10);
	      dist1.display();
	      System.out.println();
	      System.out.println();
	      
	      LastDigitDistribution dist2 = new LastDigitDistribution();
	      dist2.process(new RandomSequence(), 100);
	      dist2.display();
	}

}
