import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<>();
    }

    public int handCount(){
        return this.hand.size();
    }
    public void addCard(Card card){
        this.hand.add(card);
    }

    public int cardValue() {
        Card myCard = this.hand.get(0);
        return myCard.getValueFromEnum();
    }
}
