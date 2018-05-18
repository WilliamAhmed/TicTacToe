package com.game;

import com.game.board.Board;
import com.game.piece.Piece;
import com.game.placecommand.PlaceOCommand;
import com.game.placecommand.PlaceXCommand;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class GameManager {

	private PlayerMarker currentPlayer;
	private Board board;
	private WinManager winManager;
	private boolean gameRunning;

	public GameManager() {

	}

	public void initialiseGame() {
		board = new Board();
		currentPlayer = PlayerMarker.X;
		winManager = new WinManager(board, currentPlayer);
		gameRunning = true;
	}

	public void placePiece(int x, int y) {
		if(gameRunning) {
			Piece p = new Piece(x, y, currentPlayer);

			switch(currentPlayer) {
				case X:
					p.setCommand(new PlaceXCommand(board));
					break;
				case O:
					p.setCommand(new PlaceOCommand(board));
					break;
			}
			p.place();

			if(board.isLastPiecePlacedSuccessfully()) {
				System.out.printf("\nPlayer: %s placed a piece at (%d, %d)", currentPlayer.name(), x, y);
				if(winManager.checkWin(x, y)) {
					gameRunning = false;
					System.out.printf("\nPlayer %s wins!", currentPlayer.name());
				}
				alternatePlayer();
			} else {
				System.out.printf("\nUnable to place at (%d, %d). Player %s, please choose a different location", x, y, currentPlayer.name());
			}
		}
	}

	public String getCurrentPlayerMarker() {
		return currentPlayer.name();
	}

	public boolean isGameRunning() {
		return gameRunning;
	}

	private void alternatePlayer() {
		if(currentPlayer == PlayerMarker.X) {
			currentPlayer = PlayerMarker.O;
		} else if (currentPlayer == PlayerMarker.O) {
			currentPlayer = PlayerMarker.X;
		}
	}


}
