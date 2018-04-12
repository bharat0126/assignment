package problem3;

import java.util.ArrayList;
import java.util.List;

public class CardDeckService {

	public List<Card> getAllCardsBySuit(CardDeck deck, CardSuitTypeEnum suit) throws CardDeckException {

		if (!deck.getCards().isEmpty()) {
			List<Card> cards = new ArrayList<Card>();
			for (Card card : deck.getCards()) {
				if (card.getSuit().equals(suit)) {
					cards.add(card);
				}
			}
			return cards;
		} else {
			throw new CardDeckException("Card Packet can't be empty");
		}
	}

	

	public Card getCardsBySuitAndRank(CardDeck deck, CardSuitTypeEnum suit, CardRanksEnum rank)
			throws CardDeckException {
		if (!deck.getCards().isEmpty()) {
			Card requiredCard =null;
			for (Card card : deck.getCards()) {
				if (card.getRank().equals(rank) && card.getSuit().equals(suit)) {
					requiredCard= card;
					break;
				}
			}
			return requiredCard;
		} else {
			throw new CardDeckException("Card Packet can't be empty");
		}
	}

	public static void main(String[] args) throws CardDeckException,CardException {
		//CardDeckService cardPacket = new CardDeckService();
		CardDeck deck = new CardDeck();
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.divide(51).getCards().size());
		
		/*
		try {
			System.out.println("no of card in deck -" + deck.getCards().size());
			System.out.println("no of card in deck per suit-"
					+ cardPacket.getAllCardsBySuit(deck, CardSuitTypeEnum.Club).size());
			System.out.println("no of card in deck by rank and suit-"
					+ cardPacket.getCardsBySuitAndRank(deck, CardSuitTypeEnum.Club, CardRanksEnum.Ace).toString());
			
			// taking out card part
			List<Card> cards =new ArrayList<Card>();
			cards.addAll(cardPacket.getAllCardsBySuit(deck, CardSuitTypeEnum.Club));
			System.out.println("no of card remain in deck after removing all club cards-"
					+deck.divide(13).getCards().size());
			
			
		} catch (CardDeckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	}
}
