package test;
import java.awt.Rectangle;

public class GrowSquarePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle square = new Rectangle(100, 100, 50, 50);
		System.out.println(square);
		square.grow(25, 25);
		square.translate(25, 25);
		System.out.println(square);
	}

}
