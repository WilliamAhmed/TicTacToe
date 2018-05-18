package com.game.board;

import com.game.PlayerMarker;

import java.util.LinkedList;
import java.util.List;

/**
 * @author WilliamAhmed
 * @since 18/05/2018
 */
public class BoardStateManager {


	//TODO Implement past states for game analysis and rollback functionality
	private List<BoardState> boardList;
	private static BoardStateManager instance;

	private BoardStateManager() {
		boardList = new LinkedList<>();
	}

	public static BoardStateManager getInstance() {
		if(instance == null) {
			instance = new BoardStateManager();
		}
		return instance;
	}

	public void addBoardState(PlayerMarker[][] board) {
		boardList.add(new BoardState(board));
	}

	public BoardState getLastBoardState() {
		return boardList.get(boardList.size());
	}

}
