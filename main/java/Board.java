public class Board {
    private static final int EMPTY = -1;
    private static final int O = 0;
    private static final int X = 1;

    private int[][] board = new int[3][3];
    private int whoseTurn = X;

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    public void switchActivePlayer() {
        whoseTurn = (whoseTurn + 1) % 2; // Flips between 0 and 1
    }

    public void placeToken(int i, int j) {
        board[i][j] = whoseTurn;
    }

    public String whichPlayer() {
        return whichPlayer(whoseTurn);
    }

    private String whichPlayer(int value) {
        if (value == O) {
            return "O";
        } else if (value == X){
            return "X";
        } else {
            return " ";
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result.append(" ");
                result.append(whichPlayer(board[i][j]));
                result.append(" ");
                if (j != 2) {
                    result.append("|");
                }
            }

            if (i != 2) {
                result.append("\n");
                result.append("---|---|---");
                result.append("\n");
            }
        }

        return result.toString();
    }

}
