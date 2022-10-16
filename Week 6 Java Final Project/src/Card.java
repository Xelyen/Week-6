public class Card {

	//This is the value and suit and got my getters and setters for the two.
	//I used "suit" to keep track of it, instead of "name"
	private int value;
	private String suit;
	
	//Tried to make an Array for my cards here, but I found out I was over thinking it and it was impossible to make one
	//because of the face cards, since you can't change from an int to and String
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	//Used to print out information about a card
	public void describe() {
		System.out.println("Your card is " + getValue() + ", " + "the" + " " + getSuit());
	}
	
	
	
}
