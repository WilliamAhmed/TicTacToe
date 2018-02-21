package com.tictactoe.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author WilliamAhmed
 * @since 21/02/2018
 */
public class PieceTypeUTest {

	@Test
	public void testName() {
		PieceType pieceType = PieceType.X;
		assertEquals("X", pieceType.name());
	}
}
