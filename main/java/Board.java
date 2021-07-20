public class Board {
    private char[][] board = new char[3][3];
    private char whoseTurn = 'X';

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public void switchActivePlayer() {
        whoseTurn = whoseTurn == 'X' ? 'O' : 'X'; // Flips between 0 and 1
    }

    public void placeToken(int i, int j) {
        board[i][j] = whoseTurn;
    }

    public char whichPlayer() {
        return whoseTurn;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result.append(" ");
                result.append(board[i][j]);
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
