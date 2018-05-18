package com.game.placecommand;

import com.game.board.Board;
import com.game.PlayerMarker;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class PlaceOCommand implements Command {

	private Board board;
	private int x, y;

	public PlaceOCommand(Board board) {
		this.board = board;
	}

	@Override
	public void place(int x, int y) {
		board.placeAtLocation(x, y, PlayerMarker.O);
	}
}
