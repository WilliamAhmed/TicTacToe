package com.tictactoe.logic;

import com.tictactoe.model.Board;
import com.tictactoe.model.Coordinate;
import com.tictactoe.model.PieceType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author WilliamAhmed
 * @since 21/02/2018
 */
public class WinCheckerUTest {

	@Test
	public void checkWinYTrue() {
		Board board = Board.getInstance();
		WinChecker winChecker = new WinChecker(board.getSize());
		board.place(new Coordinate(1,1), PieceType.X);
		board.place(new Coordinate(1,2), PieceType.X);
		board.place(new Coordinate(1,3), PieceType.X);
		assertTrue(winChecker.checkWin(new Coordinate(1,3), PieceType.X));
	}

	@Test
	public void checkWinXTrue() {
		Board board = Board.getInstance();
		WinChecker winChecker = new WinChecker(board.getSize());
		board.place(new Coordinate(1,1), PieceType.O);
		board.place(new Coordinate(2,1), PieceType.O);
		board.place(new Coordinate(3,1), PieceType.O);
		assertFalse(winChecker.checkWin(new Coordinate(3,1), PieceType.X));
	}

	@Test
	public void checkWinYFalse() {
		Board board = Board.getInstance();
		WinChecker winChecker = new WinChecker(board.getSize());
		board.place(new Coordinate(1,1), PieceType.X);
		board.place(new Coordinate(2,2), PieceType.X);
		board.place(new Coordinate(1,3), PieceType.X);
		assertTrue(winChecker.checkWin(new Coordinate(1,3), PieceType.X));
	}

	@Test
	public void checkWinXFalse() {
		Board board = Board.getInstance();
		WinChecker winChecker = new WinChecker(board.getSize());
		board.place(new Coordinate(1,1), PieceType.O);
		board.place(new Coordinate(2,3), PieceType.O);
		board.place(new Coordinate(3,1), PieceType.O);
		assertFalse(winChecker.checkWin(new Coordinate(3,1), PieceType.X));
	}
}
