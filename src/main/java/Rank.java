public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(11),
    KING(12);

    //final means that the value cannot be changed. Like a const. This is a const in c sharp.
    private final int value;

    //check this constructor. You create parameters for the items in the Enum within itself. Note lack of public.
    Rank(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
//note that this is the close of the Enum

