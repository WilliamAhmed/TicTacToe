package com.tictactoe.model;

import com.tictactoe.model.board.Board;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author WilliamAhmed
 * @since 21/02/2018
 */
public class BoardUTest {

	@Test
	public void testGetInstance() {
		Board board = Board.getInstance();
		assertEquals(board, Board.getInstance());
	}

	@Test
	public void testCanPlaceFalse() {
		Coordinate coordinate = new Coordinate(1,1);
		Board board = Board.getInstance();
		board.place(coordinate, PieceType.X);
		assertFalse(board.canPlace(coordinate));
	}

	@Test
	public void testCanPlaceTrue() {
		Coordinate coordinate = new Coordinate(2,1);
		Board board = Board.getInstance();
		assertTrue(board.canPlace(coordinate));
	}

	@Test
	public void testPlaceFalse() {
		Coordinate coordinate = new Coordinate(1,1);
		Board board = Board.getInstance();
		board.place(coordinate, PieceType.X);
		assertFalse(board.place(coordinate, PieceType.X));
	}

	@Test
	public void testPlaceTrue() {
		Coordinate coordinate = new Coordinate(2,3);
		Board board = Board.getInstance();
		assertTrue(board.place(coordinate, PieceType.X));
	}

	@Test
	public void testGetPieceAtLocation() {
		Coordinate coordinate = new Coordinate(1,1);
		Board board = Board.getInstance();
		board.place(coordinate, PieceType.X);
		assertNotNull(board.getPieceAtLocation(coordinate));
	}

	@Test
	public void testGetSize() {
		Board board = Board.getInstance();
		assertEquals(3, board.getSize());
	}

}
