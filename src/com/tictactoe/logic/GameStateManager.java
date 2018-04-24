package com.tictactoe.logic;

import com.tictactoe.model.PieceType;

/**
 * @author WilliamAhmed
 * @since 21/02/2018
 */
public class GameStateManager {

	private PieceType currentPlayerPiece;
	private boolean running = true;

	public GameStateManager() {
		determineStartingPlayer();
	}

	private void determineStartingPlayer() {
		if(Math.round(Math.random()) % 2 == 0) {
			currentPlayerPiece = PieceType.X;
		} else {
			currentPlayerPiece = PieceType.O;
		}
		System.out.printf("\nPlayer %s will take the first turn", currentPlayerPiece.name());
	}

	public void alternateCurrentPlayer() {
		if(currentPlayerPiece == PieceType.X) {
			currentPlayerPiece = PieceType.O;
		} else if (currentPlayerPiece == PieceType.O) {
			currentPlayerPiece = PieceType.X;
		}
		System.out.printf("\n\n\nNow player %s's turn", currentPlayerPiece.name());
	}

	public PieceType getCurrentPlayerPiece() {
		return currentPlayerPiece;
	}

	public boolean isRunning() {
		return running;
	}

	public void hasWon() {
		running = false;
		System.out.printf("Player %s has won the game", currentPlayerPiece.name());
	}
}
