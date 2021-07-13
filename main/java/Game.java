import java.util.Scanner;

public class Game {
    public void play() {
        Board board = new Board();
        Scanner input = new Scanner(System.in);
        boolean shouldQuit = false;

        while (!board.isFull() && !shouldQuit) {
            System.out.println(board.whichPlayer() + "'s turn!");
            System.out.println(
                    "Enter the X and Y coordinates of your next move, e.g. 0 2 or 1 1, or 'quit' to exit.");
            String move = input.nextLine();
            if (move.equalsIgnoreCase("quit")) {
                shouldQuit = true;
            } else {
                int xCoord = Character.getNumericValue(move.charAt(0));
                int yCoord = Character.getNumericValue(move.charAt(2));

                board.placeToken(xCoord, yCoord);
                board.switchActivePlayer();
            }

            System.out.println();
            System.out.println(board);
            System.out.println();
        }

        if (board.isFull()) {
            System.out.println("It's a draw!");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Welcome to tic tac toe!");
        game.play();
    }
}
