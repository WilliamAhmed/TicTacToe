package com.game.piece;

import com.game.PlayerMarker;
import com.game.placecommand.Command;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class Piece {

	private int x;
	private int y;
	private PlayerMarker marker;

	private Command command;

	public Piece(int x, int y, PlayerMarker marker) {
		this.x = x;
		this.y = y;
		this.marker = marker;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void place() {
		command.place(this.x, this.y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public PlayerMarker getMarker() {
		return marker;
	}
}
