package com.game.gui;

import com.game.GameManager;

import javax.swing.*;
import java.awt.*;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class BoardPanel extends JPanel {

	private GameManager gameManager;

	public BoardPanel(GameManager gameManager) {
		this.gameManager = gameManager;
		setUp();
	}

	private void setUp() {
		this.setLayout(new GridLayout(3, 3));

		for (int x = 0; x < gameManager.getBoardSize(); x++) {
			for (int y = 0; y < gameManager.getBoardSize(); y++) {
				Button button = new Button(x, y);
				button.addActionListener(new ButtonClickAction(gameManager));
				button.setActionCommand(ButtonClickAction.BUTTON_CLICK_ACTION_COMMAND);
				this.add(button);
			}
		}
		this.setVisible(true);
	}

}
