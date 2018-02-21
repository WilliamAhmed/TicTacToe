package com.tictactoe.model;

/**
 * @author WilliamAhmed
 * @since 20/02/2018
 */
public class Coordinate {

	private int x, y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getArrayNormalizedX() {
		return x - 1;
	}

	public int getArrayNormalizedY() {
		return y - 1;
	}

	public boolean inRange(int x, int y) {
		if(this.x <= x && this.y <= y) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "(" + x + ", " + y +")";
	}

}
