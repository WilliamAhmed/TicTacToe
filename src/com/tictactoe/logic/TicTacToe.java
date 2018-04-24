package com.tictactoe.logic;

import com.tictactoe.model.Coordinate;
import com.tictactoe.model.PieceType;
import com.tictactoe.model.board.Board;

/**
 * @author WilliamAhmed
 * @since 24/04/2018
 */
public class TicTacToe {

	private GameStateManager gameStateManager = new GameStateManager();
	private Board gameBoard = Board.getInstance();
	private WinChecker winChecker = new WinChecker(gameBoard.getSize());

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

}
