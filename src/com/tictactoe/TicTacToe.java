package com.tictactoe;

import com.tictactoe.logic.GameStateManager;
import com.tictactoe.logic.WinChecker;
import com.tictactoe.model.Board;
import com.tictactoe.model.Coordinate;
import com.tictactoe.model.PieceType;

/**
 * @author WilliamAhmed
 * @since 20/02/2018
 */
public class TicTacToe {

	private Board gameBoard;
	private WinChecker winChecker;
	private GameStateManager gameStateManager;

	public TicTacToe() {
		gameStateManager = new GameStateManager();
		gameBoard = Board.getInstance();
		winChecker = new WinChecker(gameBoard.getSize());
		place(1,1);
		place(1,2);
		place(2,2);
		place(3,2);
//		place(1,3);
		place(3,3);
	}

	public void place(int x, int y) {
		if(gameStateManager.isRunning()) {
			Coordinate coordinate = new Coordinate(x, y);
			System.out.printf("\n\tAttempting to place piece %s at X: %d, Y: %d", gameStateManager.getCurrentPlayerPiece().name(), x, y);
			if(gameBoard.place(coordinate, gameStateManager.getCurrentPlayerPiece())) {

				printBoardState();
				if(winChecker.checkWin(coordinate, gameStateManager.getCurrentPlayerPiece())) {
					gameStateManager.hasWon();
				} else {
					gameStateManager.alternateCurrentPlayer();
				}
			}
		}
	}

	public void printBoardState() {
		System.out.println("\n");
		for (int x = 1; x <= gameBoard.getSize() ; x++) {
			for (int y = 1; y <= gameBoard.getSize(); y++) {
				PieceType pieceType = gameBoard.getPieceAtLocation(new Coordinate(x, y));

				if(pieceType != null){
					System.out.printf("[%s]", pieceType.name());
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		TicTacToe ticTacToe = new TicTacToe();
	}
}
