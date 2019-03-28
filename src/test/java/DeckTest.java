import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;
    private Player player;
    private Player player2;
    private Game game;

    @Before

    public void before(){
       deck = new Deck();
       player = new Player();
       player2 = new Player();
       game = new Game();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.getDeckCount());
    }

    @Test
    public void canCreateSuitArray(){
        deck.getSuitArray();
        assertEquals(4, deck.countSuits());
    }

    @Test
    public void canCreateRankArray(){
        deck.getRankArray();
        assertEquals(13, deck.countRank());
    }

    @Test
    public void deckCanBeFilled(){
        deck.getCards();
        assertEquals(52, deck.getDeckCount());
    }

    @Test
    public void canDealCard(){
        deck.getCards();
        deck.shuffleDeck();
        deck.getCard(this.player);
        assertEquals(1,player.handCount());
    }

    @Test
    public void canPlayGame() {
        deck.getCards();
        deck.shuffleDeck();
        deck.getCard(this.player);
        deck.getCard(this.player2);
        game.play(this.player, this.player2);
        assertEquals(true, true);
    }
}
