package javaCSCI;

public class LastDigitDistribution {
	
	private int counters[] = new int[10];
	private int maxNum;
	private double multiplier;
	
	public void display(){
		maxNum = 1;        //Setting bars to width 40
		for(int i = 0; i < 10; i++){
			if (counters[i] > maxNum){
				maxNum = counters[i];
			}
		}	
		multiplier = (double) (40.0 / maxNum);
		//System.out.println("Multiplier: " + multiplier + " " + maxNum); //DEBUG
		

		
		for(int i = 0; i < 10; i++){ //Printing Stars
			System.out.printf("%d: ", i);
			//System.out.printf("%d: %d ", i, counters[i]); //Number of last digits in prime //DEBUG
	
			int j = 0;
			while (j < (double) (counters[i] * multiplier)){
				System.out.printf("*");
				j++;
			}
			System.out.printf("\n");
			//System.out.printf(" " + (double) (counters[i] * multiplier) + "\n"); //DEBUG
		}
	}
	
	
	
	public void process(Sequence seq, int valuesToProcess)
		{
		for (int i = 1; i <= valuesToProcess; i++)
			{
			   int value = seq.next();
			   int lastDigit = value % 10;
			   counters[lastDigit]++;
			}
		}
}
