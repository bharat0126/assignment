package problem3;

public class Card {

    private CardRanksEnum rank;
    private CardSuitTypeEnum suit;
    
    public Card (CardRanksEnum rank,CardSuitTypeEnum suit){
	this.rank=rank;
	this.suit=suit;
    }
    
    public CardRanksEnum getRank() {
        return rank;
    }
    public void setRank(CardRanksEnum rank) {
        this.rank = rank;
    }
    public CardSuitTypeEnum getSuit() {
        return suit;
    }
    public void setSuit(CardSuitTypeEnum suit) {
        this.suit = suit;
    }
    
}
