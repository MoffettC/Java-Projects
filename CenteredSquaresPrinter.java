package javaCSCI;
import java.awt.Rectangle;

public class CenteredSquaresPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle square = new Rectangle(100, 100, 200, 200);
		System.out.println(square);
		square.grow(-50, -50);
		square.translate(0, 0);
		System.out.println(square);
	}

}
