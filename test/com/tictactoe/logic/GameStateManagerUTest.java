package com.tictactoe.logic;

import com.tictactoe.model.PieceType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameStateManagerUTest {

    private GameStateManager gameStateManager;
    private PieceType playerPiece;


    @Before
    public void setUp() {
        gameStateManager = new GameStateManager();
        playerPiece = PieceType.X;
    }

    @Test
    public void testCurrentPlayerPiece() {
        gameStateManager.setCurrentPlayerPiece(playerPiece);
        assertEquals(playerPiece, gameStateManager.getCurrentPlayerPiece());
    }

    @Test
    public void testAlternateCurrentPlayerX() {
        gameStateManager.setCurrentPlayerPiece(playerPiece);
        gameStateManager.alternateCurrentPlayer();
        assertEquals(PieceType.O, gameStateManager.getCurrentPlayerPiece());
    }

    @Test
    public void testAlternateCurrentPlayerO() {
        gameStateManager.setCurrentPlayerPiece(PieceType.O);
        gameStateManager.alternateCurrentPlayer();
        assertEquals(playerPiece, gameStateManager.getCurrentPlayerPiece());
    }

    @Test
    public void testIsRunning() {
        assertTrue(gameStateManager.isRunning());
    }

    @Test
    public void testHasWon() {
        gameStateManager.hasWon();
        assertFalse(gameStateManager.isRunning());
    }

}
