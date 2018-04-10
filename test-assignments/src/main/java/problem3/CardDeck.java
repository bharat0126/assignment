package problem3;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

	private List<Card> cards;

	private CardDeck(List<Card> cards) throws CardDeckException{
		List<Card> cardsPart = new ArrayList<Card>();
		try {
			for (CardRanksEnum rank : CardRanksEnum.values()) {
				for (CardSuitTypeEnum suit : CardSuitTypeEnum.values()) {
					// Create cards
					Card card=Card.getCardInstance(rank, suit);
					if(!cards.contains(card)){
						cardsPart.add(card);
					}

				}
			}
		} catch (CardException e) {
			throw new CardDeckException(e);
		}
		//assign to attribute
        this.cards=cardsPart;
		
	}
	
	private CardDeck() throws CardDeckException{
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

	public List<Card> getCards() {
		return cards;
	}

	public static CardDeck getFullCardDeckInstance() throws CardDeckException {
		return new CardDeck();
	}

	public static CardDeck getCardDeckPartInstance(List<Card> cards) throws CardDeckException {
		return new CardDeck(cards);
	}
}
