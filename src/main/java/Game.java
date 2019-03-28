public class Game {

    private Game game;

    public Game() {
    }

    public String play(Player player1, Player player2) {
        if (player1.cardValue() > player2.cardValue()) {
            System.out.println("Player 1 Wins!");
            return "Player 1 Wins!";
        }
        System.out.println("Player 2 Wins!");
        return "Player 2 Wins!";
    }
}
