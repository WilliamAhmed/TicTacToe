package com.game.gui;

import com.game.GameManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class ButtonClickAction implements ActionListener {

	private GameManager gameManager;
	public static final String BUTTON_CLICK_ACTION_COMMAND = "buttonClick";

	public ButtonClickAction(GameManager gameManager) {
		this.gameManager = gameManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(BUTTON_CLICK_ACTION_COMMAND) &&
				(e.getSource() instanceof Button) &&
				gameManager.isGameRunning()) {

			Button tempButton = (Button)e.getSource();
			gameManager.placePiece(tempButton.getX(), tempButton.getY());

			tempButton.setText(gameManager.getCurrentPlayerMarker());
		}
	}
}
