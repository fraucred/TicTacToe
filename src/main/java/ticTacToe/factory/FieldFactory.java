package ticTacToe.factory;

import ticTacToe.Field;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toUnmodifiableList;

public class FieldFactory {
    private static int column = 0;
    private int row = 0;

    public static List<Field> buildNineFields() {
        return List.of(
                buildField(0, 0),
                buildField(0, 1),
                buildField(0, 2),
                buildField(1, 0),
                buildField(1, 1),
                buildField(1, 2),
                buildField(2, 0),
                buildField(2, 1),
                buildField(2, 2)
        );
    }

    private static Field buildField(int column, int row) {
        return new Field(column, row, false);
    }

    private static Field buildField() {
        return new Field(false);
    }
}
