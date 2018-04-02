package problem3;

import java.util.ArrayList;
import java.util.List;

public class CardPacket {

    public List<Card> getCardPacket() {
	List<Card> packet = new ArrayList<Card>();

	for (CardRanksEnum rank : CardRanksEnum.values()) {
	    for (CardSuitTypeEnum suit : CardSuitTypeEnum.values()) {
		// Create cards
		packet.add(new Card(rank, suit));

	    }
	}
	return packet;

    }
    
    public List<Card> getAllCardsBySuit(List<Card> packet ,CardSuitTypeEnum suit) throws CardPacketException {
	
	if(!packet.isEmpty()){
	List<Card> cards = new ArrayList<Card>();
	for (Card card : packet) {
	    if (card.getSuit().equals(suit)) {
		cards.add(card);
	    }
	}
	return cards;
	}else{
	    throw new CardPacketException("Card Packet can't be empty");
	}
    }
    
    public List<Card> getAllCardsByRank(List<Card> packet,CardRanksEnum rank) throws CardPacketException {
	if(!packet.isEmpty()){
   	List<Card> cards = new ArrayList<Card>();
   	for (Card card : packet) {
   	    if (card.getRank().equals(rank)) {
   		cards.add(card);
   	    }
   	}
   	return cards;
	}else{
	    throw new CardPacketException("Card Packet can't be empty");
	}
       }
    
    public List<Card> getAllCardsBySuitAndRank(List<Card> packet,CardSuitTypeEnum suit,CardRanksEnum rank) throws CardPacketException {
	if(!packet.isEmpty()){
   	List<Card> cards = new ArrayList<Card>();
   	for (Card card : packet) {
   	    if (card.getRank().equals(rank) && card.getSuit().equals(suit)) {
   		cards.add(card);
   	    }
   	}
   	return cards;
	}else{
	    throw new CardPacketException("Card Packet can't be empty");
	}
       }

    public static void main(String[] args) {
	CardPacket cardPacket = new CardPacket();
	List<Card> packet=cardPacket.getCardPacket();
	
	try {
	    System.out.println("no of card in packet -"
	    	+ packet.size());
	    System.out.println("no of card in packet per suit-"
	    	+ cardPacket.getAllCardsBySuit(packet,CardSuitTypeEnum.Club).size());
	    System.out.println("no of card in packet by rank-"
	    	+ cardPacket.getAllCardsByRank(packet,CardRanksEnum.Ace).size());
	    System.out.println("no of card in packet by rank and suit-"
	    	+ cardPacket.getAllCardsBySuitAndRank(packet,CardSuitTypeEnum.Club,CardRanksEnum.Ace).size());
	} catch (CardPacketException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	
    }
}
