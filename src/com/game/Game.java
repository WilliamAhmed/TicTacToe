package com.game;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class Game {

	public static void main(String[] args) {
		GameManager g = new GameManager();
		g.initialiseGame();

		// X Wins Row 1
//		g.placePiece(0,0); // X
//		g.placePiece(1,1); // O
//		g.placePiece(1,0); // X
//		g.placePiece(2,1); // O
//		g.placePiece(2,0); // X

		// O Wins Row 3
//		g.placePiece(1,1); // X
//		g.placePiece(0,2); // O
//		g.placePiece(2,1); // X
//		g.placePiece(1,2); // O
//		g.placePiece(2,0); // X
//		g.placePiece(2,2); // O

		// X Wins Col 1
		g.placePiece(0,0); // X
		g.placePiece(1,1); // O
		g.placePiece(0,1); // X
		g.placePiece(2,1); // O
		g.placePiece(0,2); // X

		// O Wins Col 3
//		g.placePiece(1,1); // X
//		g.placePiece(2,0); // O
//		g.placePiece(0,1); // X
//		g.placePiece(2,1); // O
//		g.placePiece(0,2); // X
//		g.placePiece(2,2); // O

	}
}
