package com.game.gui;


import com.game.GameManager;

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
		this.setTitle("TicTacToe");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(new Dimension(400,400));

		this.getContentPane().add(new BoardPanel(gameManager));

		this.setVisible(true);
	}

}
