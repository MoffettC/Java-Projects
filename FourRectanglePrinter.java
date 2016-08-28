package javaCSCI;
import java.awt.Rectangle;

public class FourRectanglePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(0, 0, 10, 10);
		System.out.println(box);
		box.translate(10, 0);
		System.out.println(box);
		box.translate(0, -10);
		System.out.println(box);
		box.translate(-10, 0);
		System.out.println(box);
		
		String m = "hello";
		int n = m.length();
	}

}
