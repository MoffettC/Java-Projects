package test;

public class P6_5 {
	private boolean[] primeArray;
	private int total;
	
	public void nextPrime(int n){
		total = n;
		primeArray = new boolean[total];
		for(int i = 2; i < total; i++){
			primeArray[i] = true;
		}
		
		for (int i = 2; i * i < total; i++){
			isPrime(i);
		}
		for (int j = 2; j < total; j++){
			if (primeArray[j] == true){
				System.out.println(j);
			}
		}
	}
	
	public void isPrime(int i){
		for (int j = i; i * j < total; j++){
			primeArray[i * j] = false;
		}
	}
	
	
	
}
