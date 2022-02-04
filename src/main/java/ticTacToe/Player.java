package ticTacToe;

public class Player {

    private boolean isActive;

    public Player() {
    }

    public Player(boolean begins) {
        isActive = begins;
    }

    public void select(Field field) {
        field.takeOver();
    }

    public boolean isActive() {
        return isActive;
    }
}
