import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;

    @Before

    public void before(){
       deck = new Deck();
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

 //   @Test
//    public void deckCanBeFilled(){
//        deck.getCards();
//        assertEquals(52, deck.getDeckCount());
//    }
}
