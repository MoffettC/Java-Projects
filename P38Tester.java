package test;
/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Battery Lab
 * Homework P3.8
 * 2/22/16
 */
public class P38Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P38 AA = new P38(2000);
		AA.drain(400);
		System.out.println(AA.getRemainingCapacity());
		System.out.println("Expected: 1600 mAH\n");
		
		AA.charge();
		System.out.println(AA.getRemainingCapacity());
		System.out.println("Expected: 2000 mAH\n");
		
		AA.drain(3000);
		System.out.println(AA.getRemainingCapacity());
		System.out.println("Expected: 0 mAH\n");
	}

}
