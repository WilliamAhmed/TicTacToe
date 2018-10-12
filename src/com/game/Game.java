package com.game;

import com.game.gui.GameWindow;
import com.game.io.file.properties.PropertiesLoader;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class Game {

	public static void main(String[] args) {

		int boardSize = PropertiesLoader.getPropertyAsInteger("TicTacToe", "game.tictactoe.board.defaultsize");

		GameManager gameManager = new GameManager();
		gameManager.initialiseGame(boardSize);

		GameWindow gameWindow = new GameWindow(gameManager);
		gameWindow.setUp();
	}
}
