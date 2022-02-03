package ticTacToe.factory;

import ticTacToe.Field;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toUnmodifiableList;

public class FieldFactory {
    public static List<Field> buildNineFields() {
        return IntStream.range(0, 9)
                .mapToObj(value -> buildField())
                .collect(toUnmodifiableList());
    }

    private static Field buildField() {
        return new Field(false);
    }
}
