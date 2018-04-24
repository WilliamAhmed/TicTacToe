package com.tictactoe.logic;

import com.tictactoe.model.board.Board;
import com.tictactoe.model.Coordinate;
import com.tictactoe.model.PieceType;

/**
 * @author WilliamAhmed
 * @since 21/02/2018
 */
public class WinChecker {

	private int boardSize = 0;

	public WinChecker(int boardSize) {
		this.boardSize = boardSize;
	}

	public boolean checkWin(Coordinate coordinate, PieceType piece) {
		if(checkColumn(coordinate, piece)) {
			return true;
		} else if(checkRow(coordinate, piece)) {
			return true;
		} else if (checkDiag(coordinate, piece)) {

		} else if (checkReverseDiag(coordinate, piece)) {
			return true;
		}
		return false;
	}

	private boolean checkColumn(Coordinate coordinate, PieceType piece) {
		int count = 0;
		Board board = Board.getInstance();
		for (int x = 1; x <= boardSize; x++) {
			if(board.getPieceAtLocation(new Coordinate(x, coordinate.getY())) == piece) {
				count++;
			}
		}
		if(count == boardSize) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkRow(Coordinate coordinate, PieceType piece) {
		int count = 0;
		Board board = Board.getInstance();
		for (int y = 1; y <= boardSize; y++) {
			if(board.getPieceAtLocation(new Coordinate(coordinate.getX(), y)) == piece) {
				count++;
			}
		}
		if(count == boardSize) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkDiag(Coordinate coordinate, PieceType piece) {
		int count = 0;
		Board board = Board.getInstance();
		for (int x = 1; x <= boardSize; x++) {
			for (int y = 1; y <= boardSize; y++) {
				if(x == y) {
					if(board.getPieceAtLocation(new Coordinate(x, y)) == piece) {
						count++;
					}
				}
			}
		}
		System.out.println("Count: " + count);
		if(count == boardSize) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkReverseDiag(Coordinate coordinate, PieceType piece) {
		int count = 0;
//		Board board = Board.getInstance();
//		for (int x = 1; x <= boardSize; x++) {
//			for (int y = 1; y <= boardSize; y++) {
//				if(((x + y) == 4) && board.getPieceAtLocation(coordinate) == piece) {
//					count++;
//				}
//			}
//		}
		if(count == boardSize) {
			return true;
		} else {
			return false;
		}
	}
}
