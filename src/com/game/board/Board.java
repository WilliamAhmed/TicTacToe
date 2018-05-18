package com.game.board;

import com.game.PlayerMarker;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class Board {

	private PlayerMarker[][] board;
	private static final int DEFAULT_BOARD_SIZE = 3;
	private boolean lastPiecePlacedSuccessfully = false;

	private int boardSize;

	public Board() {
		this(DEFAULT_BOARD_SIZE);
	}

	public Board(int boardSize) {
		this.boardSize = boardSize;
		board = new PlayerMarker[boardSize][boardSize];
	}

	public void placeAtLocation(int x, int y, PlayerMarker marker) {
		if(isEmptyLocation(x, y)) {
			board[x][y] = marker;
			lastPiecePlacedSuccessfully = true;
		} else {
			lastPiecePlacedSuccessfully = false;
		}
	}

	public PlayerMarker getMarkerAtLocation(int x, int y) {
		if(isValidLocation(x, y)) {
			return board[x][y];
		}
		return null;
	}

	private boolean isEmptyLocation(int x, int y) {
		if(isValidLocation(x, y)) {
			if(board[x][y] == null) {
				return true;
			}
		}
		return false;
	}

	private boolean isValidLocation(int x, int y) {
		return x >= 0 && x < boardSize &&
				y >= 0 && x < boardSize;
	}

	public boolean isLastPiecePlacedSuccessfully() {
		return lastPiecePlacedSuccessfully;
	}

	public int getBoardSize() {
		return boardSize;
	}

}
