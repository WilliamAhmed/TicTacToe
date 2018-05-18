package com.game.gui;

import javax.swing.*;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class Button extends JButton {

	private int x, y;

	public Button(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


}
