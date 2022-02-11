package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    public void a_player_should_be_active_when_taking_fields() {
        Player player = new Player(true);

        boolean isPlayerActive = player.isActive();

        assertTrue(isPlayerActive);
    }

    @Test
    public void a_player_should_not_take_a_field_if_already_taken_by_another_player() {
        Player player = new Player();
        Field field = new Field(true);

        assertThrows(IllegalStateException.class, () -> player.select(field));
    }
}
