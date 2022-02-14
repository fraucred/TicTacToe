package ticTacToe;

public class Field {

    private boolean takenByPlayer;
    private int column;
    private int row;

    public Field(boolean takenByPlayer) {
        this.takenByPlayer = takenByPlayer;
    }

    public Field(int column, int row, boolean takenByPlayer) {
        this.column = column;
        this.row = row;
        this.takenByPlayer = takenByPlayer;
    }

    public boolean isTaken() {
        return takenByPlayer;
    }

    public void takeOver() {
        if (takenByPlayer) {
            throw new IllegalStateException("Field already taken by player");
        }
        takenByPlayer = true;
    }

    public boolean sameColumn(int column) {
        return this.column == column;
    }
}
