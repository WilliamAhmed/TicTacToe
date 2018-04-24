package com.tictactoe.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author WilliamAhmed
 * @since 24/04/2018
 */
public class GamePieceButton extends JButton implements ActionListener{

	private int x, y;

	public GamePieceButton(int xLocation, int yLocation) {
		x = xLocation;
		y = yLocation;
		this.setVisible(true);

		addActionListener(this);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(x + " " + y + " pressed");
	}
}
