package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {
    @Test
    public void should_take_a_field_if_not_already_taken_as_a_player() {
        Player player = new Player();
        Field field = new Field(false);

        player.select(field);

        assertTrue(field.isTaken());
    }
}
