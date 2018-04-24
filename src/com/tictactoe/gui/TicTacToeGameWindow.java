package com.tictactoe.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author WilliamAhmed
 * @since 24/04/2018
 */
public class TicTacToeGameWindow extends JFrame {

	public TicTacToeGameWindow() {
		setTitle("TicTacToe - Java");
		setSize(new Dimension(400,400));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Container content = getContentPane();
		BoardPanel board = new BoardPanel();

		content.add(board);
		setVisible(true);
	}

}
