package com.game.gui;


import com.game.GameManager;
import com.game.io.file.properties.PropertiesLoader;

import javax.swing.*;
import java.awt.*;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class GameWindow extends JFrame {

	private GameManager gameManager;

	public GameWindow(GameManager gameManager) {
		this.gameManager = gameManager;
	}

	public void setUp() {

		final String title = String.format("%s - Version %s",
							PropertiesLoader.getProperty("TicTacToe", "game.tictactoe.window.title"),
							PropertiesLoader.getProperty("TicTacToe", "game.tictactoe.version"));

		final int windowWidth = PropertiesLoader.getPropertyAsInteger("TicTacToe", "game.tictactoe.window.width");
		final int windowHeight = PropertiesLoader.getPropertyAsInteger("TicTacToe", "game.tictactoe.window.height");


		this.setTitle(title);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(new Dimension(windowWidth,windowHeight));

		this.getContentPane().add(new BoardPanel(gameManager));

		this.setVisible(true);
	}

}
