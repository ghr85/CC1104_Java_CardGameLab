import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;
    private SuitType[] suits;
    private Rank[] rank;

    public Deck(){
        this.deck = new ArrayList<>();
        this.suits = new SuitType[4];
        this.rank = new Rank[12];

    }


    public int getDeckCount() {
        return this.deck.size();
    }

    public void getCards() {

    }
    public void getSuitArray(){
        this.suits = SuitType.values();
    }
    public void getRankArray(){
        this.rank = Rank.values();
    }

    public int countSuits() {
        return this.suits.length;
    }

    public int countRank() {
        return this.rank.length;
    }
}
