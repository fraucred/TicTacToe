package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameOverTest {

    @Test
    public void game_is_over_when_all_fields_are_taken() {
        Game game = new Game();
        Player player = new Player(true);

        player.select(game, 0, 0);
        player.select(game, 0, 1);
        player.select(game, 0, 2);

        assertTrue(game.isOver());
    }
}
