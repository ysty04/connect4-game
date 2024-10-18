public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Human", "Yellow");
        Player player2 = new Player("Computer", "Red");
        Game game = new Game(player1, player2, 6, 7);
        game.startGame();
    }
}
