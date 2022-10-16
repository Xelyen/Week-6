public class App {

	public static void main(String[] args) {
		
		//Instantiate a deck and two players
		//I called player 1 - p1 and player 2 - p2
		Deck deckOfCards = new Deck();
		Player p1 = new Player("Kevin");
		Player p2 = new Player("Dennis");
		
		System.out.println("Player 1: " + p1.getName() + " | " + "Player 2: " + p2.getName());
		System.out.println("");
		//Called the shuffle method to the deckOfCards
		deckOfCards.shuffleDeck();
		
		//Used a for loop to iterate 52 times and calling the draw method passing through
		//the deckOfCards that I instantiated
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(deckOfCards);
			} else {
				p2.draw(deckOfCards);
			}
		}
		
		//Used for loop to iterate 26 times and call the flip method for each player
		Card p1CardValue = new Card();
		Card p2CardValue = new Card();
		
		for (int i = 0; i < 26; i++) {
			p1CardValue = p1.flip(p1.getPlayerHand());
			System.out.println("Player 1: " + p1.getName());
			p1CardValue.describe();
			System.out.println("");
			
			p2CardValue = p2.flip(p2.getPlayerHand());
			System.out.println("Player 2: " + p2.getName());
			p2CardValue.describe();
			System.out.println("");
			
			//Had to make a method to compare the value of each card from the two players
			//and use the increment method on which card is higher, lower or the same.
			endRound(p1, p1CardValue.getValue(), p2, p2CardValue.getValue());
			
			//Method from Player class
			p1.describe2();
			p2.describe2();
			System.out.println("---------------------------------------");
			
			
		}
		
		//Made a method to print out the winner using if else.
		System.out.println(finalScore(p1, p2));

	}
	
	public static void endRound(Player p1, int playerOneCard, Player p2, int playerTwoCard) {
		if (playerOneCard > playerTwoCard) {
			p1.incrementScore();
		} else if (playerOneCard < playerTwoCard) {
			p2.incrementScore();
		} else {
			System.out.println("It's a draw");
		}
	}
	
	public static int finalScore(Player p1, Player p2) {
		int p1Score = p1.getScore();
		int p2Score = p2.getScore();
		
		if (p1Score > p2Score) {
			System.out.println(p1.getName() + " Wins!");
		} else if (p1Score < p2Score) {
			System.out.println(p2.getName() + " Wins!");
		} else {
			System.out.println("It's a draw");
		}
		return 0;
	}

}
