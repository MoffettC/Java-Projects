package test;
import java.awt.Rectangle;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(0, 0, 200, 200);
		Rectangle r2 = new Rectangle(100, 100, 200, 200);
		Rectangle r3 = new Rectangle();
		System.out.println(r1);
		System.out.println(r2);
		
		r3 = r1.intersection(r2);
		System.out.println("Intersection of Rectangles " + r3);
		
		r2.translate(200, 200);
		r3 = r1.intersection(r2);
		//If width and height are negative, no rectangles are overlapping
		System.out.println("Intersection of Rectangles Not OverLapping " + r3);
		
	}

}
