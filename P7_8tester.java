package test;

import java.util.Scanner;

public class P7_8tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		P7_8 game = new P7_8();
		game.drawBoard();
		while (game.getGameStatus() == false){
			System.out.println("Please input each coordinate and hit enter, player " + game.getPlayer() + ":");
			System.out.printf("Input X coordinate and hit enter:");
			int x = in.nextInt();
			System.out.printf("Input Y coordinate and hit enter:");
			int y = in.nextInt();
			game.inputMove(x, y);
		}

	}

}
