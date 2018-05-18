package com.game;

import com.game.gui.GameWindow;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class Game {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		gameManager.initialiseGame();

		GameWindow gameWindow = new GameWindow(gameManager);
		gameWindow.setUp();

		// X Wins Row 1
//		gameManager.placePiece(0,0); // X
//		gameManager.placePiece(1,1); // O
//		gameManager.placePiece(1,0); // X
//		gameManager.placePiece(2,1); // O
//		gameManager.placePiece(2,0); // X

		// O Wins Row 3
//		gameManager.placePiece(1,1); // X
//		gameManager.placePiece(0,2); // O
//		gameManager.placePiece(2,1); // X
//		gameManager.placePiece(1,2); // O
//		gameManager.placePiece(2,0); // X
//		gameManager.placePiece(2,2); // O

		// X Wins Col 1
//		gameManager.placePiece(0,0); // X
//		gameManager.placePiece(1,1); // O
//		gameManager.placePiece(0,1); // X
//		gameManager.placePiece(2,1); // O
//		gameManager.placePiece(0,2); // X

		// O Wins Col 3
//		gameManager.placePiece(1,1); // X
//		gameManager.placePiece(2,0); // O
//		gameManager.placePiece(0,1); // X
//		gameManager.placePiece(2,1); // O
//		gameManager.placePiece(0,2); // X
//		gameManager.placePiece(2,2); // O

	}
}
