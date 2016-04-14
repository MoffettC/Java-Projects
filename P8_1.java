package test;


public class P8_1 {
	
	private int num1;
	private int num2;
	private int num3;
	private int dial = 0;
	private boolean check1 = false;
	private boolean check2 = false;
	private boolean check3 = false;
	
	public P8_1(int secret1, int secret2, int secret3){
		num1 = secret1;
		num2 = secret2;
		num3 = secret3;
	}
	
	public void reset(){
		dial = 0;
	}

	public void turnLeft(int ticks){
		dial = dial - ticks;
		if (dial < 0){
			dial = 39 + dial;
		}
		//System.out.println(dial);
		if (check1 == true){
			if (dial == num1){
				check2 = true;
			}
		} 
	}
	
	public void turnRight(int ticks){
		dial = (dial + ticks) % 39;
		//System.out.println(dial);
		if (check1 == false){
			if (dial == num1){
				check1 = true;
			}
		} else if (check1 == true || check2 == true){
			if (dial == num3){
				check3 = true;
			}
		}
	}
	
	public boolean open(){
		if (check1 == true){
			if (check2 == true){
				if (check3 == true){
					return true;
				}
			}
		} 
	return false;

	}
	
	
}
