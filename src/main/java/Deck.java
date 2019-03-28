import java.util.ArrayList;
import java.util.Random;

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

    public ArrayList getCards() {
        getRankArray();
        getSuitArray();
        for (int i=0 ; i < this.suits.length ; i++) {
            SuitType suit = this.suits[i];
            for (int j=0 ; j < this.rank.length ; j++) {
                Rank rank = this.rank[j];
                Card newCard = new Card(suit, rank);
                this.deck.add(newCard);
            }
        }
        return this.deck;
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

    public  ArrayList shuffleDeck() {
            Random r = new Random();
            for (int i = this.deck.size() - 1; i > 0; i--) {
                int index = r.nextInt(i);
                Card tmp = this.deck.get(index);
                this.deck.set(index,this.deck.get(i));
                this.deck.set(i, tmp);
            }
            return this.deck;
        }

        public void getCard(Player player){
          Card card = this.deck.get(0);
          player.addCard(card);
    }

}
