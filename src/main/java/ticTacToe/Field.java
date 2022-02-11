package ticTacToe;

public class Field {

    private boolean takenByPlayer;

    public Field(boolean takenByPlayer) {
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
}
