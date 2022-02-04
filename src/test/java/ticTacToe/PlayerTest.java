package ticTacToe;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {
    @Test
    public void should_take_a_field_if_not_already_taken_as_a_player() {
        Player player = new Player();
        Field field = new Field(false);

        player.select(field);

        assertTrue(field.isTaken());
    }

    @Test
    public void a_player_should_not_be_active_when_waiting_for_its_turn() {
        Player player = new Player();

        boolean isPlayerActive = player.isActive();

        assertFalse(isPlayerActive);
    }

    @Test
    @Disabled
    public void a_player_should_not_take_a_field_if_already_taken_by_another_player() { // TODO deal with this complex use case
        Player player = new Player();
        Field field = new Field(true);

        player.select(field);

        assertTrue(field.isTaken());
    }
}
