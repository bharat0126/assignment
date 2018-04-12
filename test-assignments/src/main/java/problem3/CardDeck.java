package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

	private  List<Card> cards;

	public CardDeck() throws CardDeckException{
		List<Card> cards = new ArrayList<Card>();
		try {
			for (CardRanksEnum rank : CardRanksEnum.values()) {
				for (CardSuitTypeEnum suit : CardSuitTypeEnum.values()) {
					// Create cards
					cards.add(Card.getCardInstance(rank, suit));

				}
			}
		} catch (CardException e) {
			throw new CardDeckException(e);
		}
		//assign to attribute
        this.cards=cards;
		
	}

	public CardDeck divide(Integer position) throws CardDeckException {
		if(position < 52 && position >0){
			if(this.cards !=null ){
				this.cards=	this.cards.subList(position, this.cards.size());
			}
		}else{
			throw new CardDeckException("Invalid position to split");
		}
		return this;
	}
	
	public CardDeck shuffle(){
		Collections.shuffle(this.cards);
		return this;
	}
	
	public List<Card> getCards() {
		return cards;
	}

	@Override
	public String toString() {
		return "CardDeck [cards=" + cards + "]";
	}
}
