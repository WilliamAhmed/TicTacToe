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
		this.setLayout(new GridLayout(3,3));

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {

				Button button = new Button(x, y);
				button.addActionListener(new ButtonClickAction(gameManager));
				button.setActionCommand(ButtonClickAction.BUTTON_CLICK_ACTION_COMMAND);

				this.getContentPane().add(button);
			}
		}
		this.setVisible(true);
	}

}
