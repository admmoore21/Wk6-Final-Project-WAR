package wk6FinalProjectWAR;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
//Fields
	public ArrayList <Card> deck;
	public Card card = new Card();
	
//Constructors
	
	public Deck() {
		deck = new ArrayList<Card>();
		
		for (int i = 0; i < 13; i++) {
			Card card = new Card(i, "Hearts");
			addCard(card);
		}
		for (int i = 0; i < 13; i++) {
			Card card = new Card(i, "Diamonds");
			addCard(card);
		}
		for (int i = 0; i < 13; i++) {
			Card card = new Card(i, "Spades");
			addCard(card);
		}
		for (int i = 0; i < 13; i++) {
			Card card = new Card(i, "Clubs");
			addCard(card);
		}
	}
	
//Methods (add a card, Draw a card, added describe to test validity of deck method.
	public void addCard(Card card) {
		this.deck.add(card);
	}
	
	public Card drawCard() {
		Card drawnCard= deck.get(0);
		deck.remove(deck.get(0));
		return drawnCard;
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	public void describe() {
		for (Card card : deck) {
			card.describe();
		}
	}
}
