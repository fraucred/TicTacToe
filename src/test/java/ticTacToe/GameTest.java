package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void should_return_true_when_game_is_over() {
        Game game = new Game(true);

        assertTrue(game.isOver());
    }

    @Test
    public void should_return_false_when_game_is_not_over() {
        Game game = new Game(false);

        assertFalse(game.isOver());
    }

    @Test
    public void should_return_9_when_count_total_fields_in_tic_tac_toe_game() {
        Game game = new Game();

        assertEquals(9, game.numberOfFields());
    }

    @Test
    public void tic_tac_toe_game_should_not_have_less_than_two_players() {
        Game game = new Game();

        assertTrue(game.numberOfPlayers() >= 2);
    }

    @Test
    public void tic_tac_toe_game_should_not_have_more_than_two_players() {
        Game game = new Game();

        assertTrue(game.numberOfPlayers() <= 2);
    }
}
