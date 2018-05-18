package com.game;

import com.game.gui.GameWindow;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class Game {

	private static final int DEFAULT_BOARD_SIZE = 3;

	public static void main(String[] args) {

		int boardSize = DEFAULT_BOARD_SIZE;

		if(args.length > 0) {
			boardSize = Integer.parseInt(args[0]);
		}

		GameManager gameManager = new GameManager();
		gameManager.initialiseGame(boardSize);

		GameWindow gameWindow = new GameWindow(gameManager);
		gameWindow.setUp();
	}
}
