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

    public void select(Game game, int column, int row) {
        if (column == 0) {
            game.stopGame();
        } else if (column == 2) {
            game.stopGame();
        } else {
            game.checkIsOver();
        }
    }
}
