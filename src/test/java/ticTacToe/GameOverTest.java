package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameOverTest {

    @Test
    public void game_is_over_when_all_fields_in_a_column_index_0_are_taken() {
        Game game = new Game();
        Player player = new Player(true);

        player.select(game, 0, 0);
        player.select(game, 0, 1);
        player.select(game, 0, 2);

        assertTrue(game.isOver());
    }

    @Test
    public void game_is_not_over_when_all_fields_from_the_same_column_are_not_taken() {
        Game game = new Game();
        Player player = new Player(true);

        player.select(game, 0, 0);
        player.select(game, 0, 1);
        player.select(game, 1, 2);

        assertFalse(game.isOver());
    }

    @Test
    public void game_is_over_when_all_fields_in_a_column_index_2_are_taken() {
        Game game = new Game();
        Player player = new Player(true);

        player.select(game, 2, 0);
        player.select(game, 2, 1);
        player.select(game, 2, 2);

        assertTrue(game.isOver());
    }
}
