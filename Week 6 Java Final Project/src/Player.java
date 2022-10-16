import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//Added my fields and placed my getters and setters
	private List<Card> playerHand = new ArrayList<Card>();
	private int score;
	private String name;
	
	//I originally didn't have this method here in the beginning, but when I went and started on the App class
	//I realized I had to take in the player names, so I needed a method for it
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	public List<Card> getPlayerHand() {
		return playerHand;
	}
	
	public void setHand(List<Card> playerHand) {
		this.playerHand = playerHand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Prints the name and the score
	public void describe2() {
		System.out.println(this.name + " " + this.score);
	}
	
	//Removes and returns the top card of the Hand
	public Card flip(List<Card> playerHand) {
		Card topCard = new Card();
		topCard = playerHand.get(0);
		playerHand.remove(0);
		return topCard;
	}
	
	//This one was confusing but eventually I got to it thanks to eclipse.
	//I just took the deckOfCards and invoked it from my drawCard method in Deck class
	//and the passed it through the deck of cards of my list of cards.
	public void draw(Deck deckOfCards) {
		Card newCard = new Card();
		if ((newCard = deckOfCards.drawCard(deckOfCards.cards)) != null) {
			this.playerHand.add(newCard);
		}
	}
	
	//Adds 1 to the score
	public void incrementScore() {
		this.score++;
	}

}
