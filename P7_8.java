package test;
/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework P7.8
 * 3/5/16
 */

public class P7_8 {

	private int boardSize = 3;
	private String[][] board = new String[boardSize][boardSize];
	private int player;
	private boolean gameWon = false;
	
	public P7_8(){
		resetBoard();
	}
	
	public void resetBoard(){
		player = 0;
		for(int i = 0; i < boardSize; i++){
			for(int j = 0; j < boardSize; j++){
				board[i][j] = "Empty";
			}
		}
	}
	
	public void drawBoard(){
		System.out.printf("%6s | %6s  | %6s %7s", board[0][0], board[0][1], board[0][2], " ");
		System.out.printf("00 | 01 | 02\n");
		System.out.printf("-------|---------|-------%8s", " ");
		System.out.printf("---|----|---\n");
		System.out.printf("%6s | %6s  | %6s %7s", board[1][0], board[1][1], board[1][2], " ");
		System.out.printf("10 | 11 | 12\n");
		System.out.printf("-------|---------|-------%8s", " ");
		System.out.printf("---|----|---\n");
		System.out.printf("%6s | %6s  | %6s %7s", board[2][0], board[2][1], board[2][2], " ");
		System.out.printf("20 | 21 | 22\n\n");
	}

	
	public void inputMove(int x, int y){
		if ((player == 0) && (board[x][y] == "Empty") && (x < boardSize && y < boardSize)){
			board[x][y] = "0";
			player = 1;
			drawBoard();
			checkWin();
		} else if ((player == 1) && (board[x][y] == "Empty") && (x < boardSize && y < boardSize)){
			board[x][y] = "X";
			player = 0;
			drawBoard();
			checkWin();
		} else {
			System.out.println("Cant Move There!");
		}
	}
	
	public void checkWin(){
		if ((board[0][0] == "O" && board[0][1] == "0" && board[0][2] == "0") ||
				(board[1][0] == "0" && board[1][1] == "0" && board[1][2] == "0") ||
				(board[2][0] == "0" && board[2][1] == "0" && board[2][2] == "0") ||
				(board[0][0] == "0" && board[1][0] == "0" && board[2][0] == "0") ||
				(board[0][1] == "0" && board[1][1] == "0" && board[2][1] == "0") ||
				(board[0][2] == "0" && board[1][2] == "0" && board[2][2] == "0") ||
				(board[0][0] == "0" && board[1][1] == "0" && board[2][2] == "0") ||
				(board[2][0] == "0" && board[1][1] == "0" && board[0][2] == "0")) {
			System.out.println("Player 1 Wins!");
			gameWon = true;
		} else if ((board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X") ||
				(board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X") ||
				(board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X") ||
				(board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X") ||
				(board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X") ||
				(board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X") ||
				(board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X") ||
				(board[2][0] == "X" && board[1][1] == "X" && board[0][2] == "X")) {
			System.out.println("Player 2 Wins!");
			gameWon = true;
		}
	}
	
	public int getPlayer(){
		return player;
	}
	
	public boolean getGameStatus(){
		return gameWon;
	}
}
