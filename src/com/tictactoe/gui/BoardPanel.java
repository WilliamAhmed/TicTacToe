package com.tictactoe.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author WilliamAhmed
 * @since 24/04/2018
 */
public class BoardPanel extends JPanel{

	private final int size = 3;

	public BoardPanel() {

		setLayout(new GridLayout(size, size));

		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				this.add(new GamePieceButton(x, y));
			}
		}
	}


}
