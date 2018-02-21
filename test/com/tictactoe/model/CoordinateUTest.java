package com.tictactoe.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author WilliamAhmed
 * @since 21/02/2018
 */
public class CoordinateUTest {

	@Test
	public void testGetX() {
		Coordinate coordinate = new Coordinate(2,2);
		assertEquals(2, coordinate.getX());
	}

	@Test
	public void testGetY() {
		Coordinate coordinate = new Coordinate(2,2);
		assertEquals(2, coordinate.getY());
	}

	@Test
	public void testGetArrayNormalizedX() {
		Coordinate coordinate = new Coordinate(1,1);
		assertEquals(0, coordinate.getArrayNormalizedX());
	}

	@Test
	public void testGetArrayNormalizedY() {
		Coordinate coordinate = new Coordinate(1,1);
		assertEquals(0, coordinate.getArrayNormalizedY());
	}

	@Test
	public void testInRangeTrue() {
		Coordinate coordinate = new Coordinate(3,4);
		assertTrue(coordinate.inRange(5,5));
	}

	@Test
	public void testInRangeFalse() {
		Coordinate coordinate = new Coordinate(3,4);
		assertFalse(coordinate.inRange(2,5));
	}

	@Test
	public void testToString() {
		Coordinate coordinate = new Coordinate(5,5);
		assertNotNull(coordinate.toString());
	}
}
