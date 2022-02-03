package ticTacToe;

public class Player {
    public void select(Field field) {
        field.takeOver();
    }

    public boolean isActive() {
        return true;
    }
}
