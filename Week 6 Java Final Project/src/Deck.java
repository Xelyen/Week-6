import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();
	
	//Made two methods here and passed it through cards
	public Deck() {
		deckOfCards(cards);
	}
	
	//Didn't know how to shuffle cards, but it was easy to find it on google
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	
	//Draw card method, we were asked to remove and return the top card of the cards field
	public Card drawCard(List<Card> cards) {
		Card topCard = new Card();
		if (cards.size() == 0) {
			return null;
		} else {
			topCard = cards.get(0);
			cards.remove(0);
			return topCard;
		}
	}
	
	//This took a bit, it was hard to figure out how to take in the suit and the card number
	//Eventually, I found out the switch statement worked really well in this scenario and using .add to add it to the list
	//Also had the issue on why the suits were printing out only diamonds.
	//It was fixed when I moved my newCard list inside the loop instead of outside.
	private List<Card> cardSuit(int value, String cardNum) {
		List<Card> suits = new ArrayList<Card>();
		for (int i = 1; i <= 4; i++) {
			Card newCard = new Card();
			newCard.setValue(value);
			switch (i) {
			
			case 1: newCard.setSuit(cardNum + "Spades");
					suits.add(newCard);
					break;
			
			case 2: newCard.setSuit(cardNum + "Clovers");
					suits.add(newCard);
					break;
			
			case 3: newCard.setSuit(cardNum + "Hearts");
					suits.add(newCard);
					break;
			
			case 4: newCard.setSuit(cardNum + "Diamonds");
					suits.add(newCard);
					break;
			}
		}
		return suits;
	}

	//Over here I made my list for my cards 2-14 and invoked it to the cardSuit to take in the suit of the card.
	//I just stuck on with the switch statement and using addAll to add to an existing List.
	private void deckOfCards(List<Card> cards) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 14; i++) {
			switch (i) {
			case 2:
				cards.addAll(cardSuit(i, "Two of "));
				break;
				
			case 3:
				cards.addAll(cardSuit(i, "Three of "));
				break;
				
			case 4:
				cards.addAll(cardSuit(i, "Four of "));
				break;
				
			case 5:
				cards.addAll(cardSuit(i, "Five of "));
				break;
				
			case 6:
				cards.addAll(cardSuit(i, "Six of "));
				break;
				
			case 7:
				cards.addAll(cardSuit(i, "Seven of "));
				break;
				
			case 8:
				cards.addAll(cardSuit(i, "Eight of "));
				break;
				
			case 9:
				cards.addAll(cardSuit(i, "Nine of "));
				break;
				
			case 10:
				cards.addAll(cardSuit(i, "Ten of "));
				break;
				
			case 11:
				cards.addAll(cardSuit(i, "Jack of "));
				break;
				
			case 12:
				cards.addAll(cardSuit(i, "Queen of "));
				break;
				
			case 13:
				cards.addAll(cardSuit(i, "King of "));
				break;
				
			case 14:
				cards.addAll(cardSuit(i, "Ace of "));
				break;
			}
		}
		
		
	}

}
