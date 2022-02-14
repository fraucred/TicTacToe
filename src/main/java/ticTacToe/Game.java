package ticTacToe;

import ticTacToe.factory.FieldFactory;

import java.util.List;

public class Game {
    private boolean isOver;
    private final List<Field> fields;

    public Game(boolean isOver) {
        this.isOver = isOver;
        this.fields = newGameGrid();
    }

    public Game() {
        this.fields = newGameGrid();
    }

    public boolean isOver() {
        return isOver;
    }

    public int numberOfFields() {
        return fields.size();
    }

    public int numberOfPlayers() {
        return 2;
    }

    public void stopGame() {
        isOver = true;
    }

    public void checkIsOver() {
        isOver = false;
    }

    private List<Field> newGameGrid() {
        return FieldFactory.buildNineFields();
    }

    public void checkIsOver(int column, int row) {
        fields.stream()
        isOver = fields.stream()
                .filter(field -> field.sameColumn(column))
                .allMatch(Field::isTaken);
    }
}
