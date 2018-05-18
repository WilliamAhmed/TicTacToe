package com.game;

import com.game.board.Board;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class WinManager {

	private PlayerMarker currentPlayer;
	private Board board;

	public WinManager(Board board, PlayerMarker currentPlayer) {
		this.board = board;
		this.currentPlayer = currentPlayer;
	}

	public boolean checkWin(int x, int y) {
		return  checkRowWin(y) ||
				checkColumnWin(x) ||
				checkDiagWin() ||
				checkInvertedDiagWin();
	}

	private boolean checkRowWin(int rowIndex) {
		int winCount = 0;
		for (int x = 0; x < board.getBoardSize(); x++) {
			if(board.getMarkerAtLocation(x, rowIndex) == currentPlayer) {
				winCount++;
			}
		}
		return winCount == board.getBoardSize();
	}

	private boolean checkColumnWin(int columnIndex) {
		int winCount = 0;
		for (int y = 0; y < board.getBoardSize(); y++) {
			if(board.getMarkerAtLocation(columnIndex, y) == currentPlayer) {
				winCount++;
			}
		}
		return winCount == board.getBoardSize();
	}

	private boolean checkDiagWin() {
		int winCount = 0;
		for (int x = 0; x < board.getBoardSize(); x++) {
			for (int y = 0; y < board.getBoardSize(); y++) {
				if(x == y) {
					if(board.getMarkerAtLocation(x, y) == currentPlayer) {
						winCount++;
					}
				}
			}
		}
		return winCount == board.getBoardSize();
	}

	private boolean checkInvertedDiagWin() {
		int winCount = 0;
		for (int x = 0; x < board.getBoardSize(); x++) {
			for (int y = 0; y < board.getBoardSize(); y++) {
				if(x+y == (board.getBoardSize() - 1)) {
					if(board.getMarkerAtLocation(x, y) == currentPlayer) {
						winCount++;
					}
				}
			}
		}
		return winCount == board.getBoardSize();
	}
}
