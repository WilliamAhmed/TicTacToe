package com.game.board;

import com.game.PlayerMarker;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class BoardState {

	private PlayerMarker[][] board;

	public BoardState(PlayerMarker[][] board) {
		this.board = board;
	}

	public PlayerMarker[][] getBoard() {
		return board;
	}

}
