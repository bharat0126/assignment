package problem3;

public class Card {

    private CardRanksEnum rank;
    private CardSuitTypeEnum suit;
    
    private Card (CardRanksEnum rank,CardSuitTypeEnum suit){
	 this.rank=rank;
	 this.suit=suit;
    }
    
    public static Card getCardInstance(CardRanksEnum rank,CardSuitTypeEnum suit) throws CardException{
    	if(rank !=null && suit!=null){
    	    return new Card ( rank, suit);
    	}else{
    		throw new CardException("card can't be created");
    	}
    }
    
    public CardRanksEnum getRank() {
        return rank;
    }
    
    public CardSuitTypeEnum getSuit() {
        return suit;
    }

	@Override
	public String toString() {
		return "Card [rank=" + rank.name() + ", suit=" + suit.name() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
    
}
