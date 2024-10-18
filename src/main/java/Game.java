import java.util.Scanner;

public class Game {
    private final Board board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;

    public Game(Player player1, Player player2, int rows, int columns) {
        this.board = new Board(rows, columns);
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getColor() + "), choose a column: ");
            int column = scanner.nextInt();
            if (board.dropDisc(column, currentPlayer.getColor())) {
                if (board.checkWin(currentPlayer.getColor())) {
                    displayBoard();
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }
                switchPlayer();
            } else {
                System.out.println("Column is full, try again.");
            }
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private void displayBoard() {
        System.out.println(board.toString());
    }
}
