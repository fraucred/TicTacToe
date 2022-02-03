package ticTacToe;

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

    private List<Field> newGameGrid() {
        return null;
    }
}
