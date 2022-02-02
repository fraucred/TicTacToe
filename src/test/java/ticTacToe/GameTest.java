package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {

    @Test
    public void should_return_true_when_game_is_over() {
        Game game = new Game();

        assertTrue(game.isOver());
    }
}
