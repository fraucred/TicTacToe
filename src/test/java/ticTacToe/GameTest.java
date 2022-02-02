package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {

    @Test
    public void should_return_true_when_game_is_over() {
        Game game = new Game();

        assertTrue(game.isOver());
    }

    @Test
    public void should_return_false_when_game_is_not_over() {
        Game game = new Game();

        assertFalse(game.isOver());
    }
}
