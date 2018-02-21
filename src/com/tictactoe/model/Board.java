package com.tictactoe.model;

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

	public boolean canPlace(Coordinate coordinate) {
		if(coordinate.inRange(size, size)) {
			if(boardPieces[coordinate.getArrayNormalizedX()][coordinate.getArrayNormalizedY()] == null) {
				return true;
			} else {
				System.out.printf("\n\t\tPiece already in place at %s", coordinate.toString());
			}
		} else {
			System.out.printf("\n\t\tCo-Ordinates Out Of Bounds %s",coordinate.toString());
		}
		return false;
	}

	public boolean place(Coordinate coordinate, PieceType type) {

		if(canPlace(coordinate)) {
			boardPieces[coordinate.getArrayNormalizedX()][coordinate.getArrayNormalizedY()] = type;
			System.out.printf("\n\t\tPiece %s has been placed at %s", type.name(), coordinate.toString());
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
