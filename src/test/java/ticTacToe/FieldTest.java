package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FieldTest {

    @Test
    public void should_return_true_when_checking_if_field_is_taken() {
        Field field = new Field(true);

        assertTrue(field.isTaken());
    }

    @Test
    public void should_return_false_when_checking_if_field_is_taken() {
        Field field = new Field(false);

        assertFalse(field.isTaken());
    }
}
