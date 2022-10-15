package wk6FinalProjectWAR;

import java.util.ArrayList;
import java.util.List;

public class Player {

//Fields  (Name, Score, Hand (List of Cards)
	private String name;
	private int score = 0;
	private List<Card> hand = new ArrayList<Card>();
	
//Constructors
	public Player(String name) {
		this.name = name;
	}

	/* Methods (describe(print out info), flip(remove and return top Card of the Hand),
 * draw(takes a Deck as an argument and calls the draw method on the deck, adding the returned
 * hand to the deck), and increment score (adds 1 to the Player's score)
 */
	public void describePlayer() {
		System.out.println(name + " has the following hand:");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flipCard() {
		return hand.remove(0);
	}
	
	public void dealCards(Deck deck) {
		Card card = deck.drawCard();
		hand.add(card);
	}
	
	public void addPoint() {
		score++;
	}
	
//Setters and Getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
}
