package com.tictactoe.model.board;

import com.tictactoe.exception.CoordinateOutOfBoundsException;
import com.tictactoe.exception.LocationNotEmptyException;
import com.tictactoe.model.Coordinate;
import com.tictactoe.model.PieceType;

/**
 * @author WilliamAhmed
 * @since 20/02/2018
 */
public class Board {

	private static Board instance = null;
	private int size = 3;
	private PieceType[][] boardPieces;

	private Board() {
		boardPieces = new PieceType[size][size];
	}

	public static Board getInstance() {
		if(instance == null) {
			instance = new Board();
		}
		return instance;
	}

	public boolean canPlace(Coordinate coordinate){

		try {

			if(coordinate.inRange(size, size)) {
				if(boardPieces[coordinate.getArrayNormalizedX()][coordinate.getArrayNormalizedY()] == null) {
					return true;
				} else {
					throw new LocationNotEmptyException("The location " + coordinate.toString() + " is not empty");
				}
			} else {
				throw new CoordinateOutOfBoundsException("Coordinate " + coordinate.toString() + " is out of bounds");
			}

		} catch (CoordinateOutOfBoundsException |
				 LocationNotEmptyException exception) {
		}

		return false;
	}

	public boolean place(Coordinate coordinate, PieceType type) {

		if(canPlace(coordinate)) {
			boardPieces[coordinate.getArrayNormalizedX()][coordinate.getArrayNormalizedY()] = type;
			return true;
		}
		return false;
	}

	public PieceType getPieceAtLocation(Coordinate coordinate) {
		return boardPieces[coordinate.getArrayNormalizedX()][coordinate.getArrayNormalizedY()];
	}

	public int getSize() {
		return size;
	}
}
