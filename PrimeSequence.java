package test;

public class PrimeSequence implements Sequence{

	private int totalNum = 2;
	private int primeNum;

	
	public int next(){
		while (!isPrime()){
			totalNum++;
			if (isPrime()){				
				break;
			}
		}		
		primeNum = totalNum;
		//System.out.println(primeNum);  //DEBUG
		totalNum++;
		return primeNum;
	}
	
	public boolean isPrime(){
		for (int i = 2; i <= totalNum / 2; i++){
			if (totalNum % i == 0){
				//System.out.println("False " + totalNum); //DEBUG
				return false;		
			}
		}
		//System.out.println("True " + totalNum);  //DEBUG
		return true;
	}
	
	
	
}
