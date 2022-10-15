package wk6FinalProjectWAR;

import java.util.Scanner;

public class App {
	
	
	public static void main(String[] args) {
		//Create a new Deck, Two Players, and shuffle the deck
		Deck deck = new Deck();
		
		try (//Creating players with input scanner
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Player One enter your name: ");
			Player playerOne = new Player(scanner.nextLine());
			System.out.print("Player Two enter your name: ");
			Player playerTwo = new Player(scanner.nextLine());
			
			
			deck.shuffle();
			
			/*Using a traditional for loop, iterate 52 times calling the Draw method on the
			 * other player each iteration 
			 */
			
			for (int i = 0; i < 52; i++) {
				if (i % 2 == 0) {
					playerOne.dealCards(deck);
				} else {
					playerTwo.dealCards(deck);
				}
			}
			
			/*Compare the value of each card returned by the two player's flip method
			 * Call the addPoint method on the player whose card is higher.
			 * After the loop, compare the final score from each player
			 */
			System.out.println("Let the WAR begin!");
			System.out.println("");
			for (int i = 1; i <= 26; i ++) {
				System.out.println("Draw your cards!");
				Card p1Card = playerOne.flipCard();
				System.out.print(playerOne.getName() + "s card: ");
				p1Card.describe();
				Card p2Card = playerTwo.flipCard();
				System.out.print(playerTwo.getName() + "s card: ");
				p2Card.describe();
				if (p1Card.getValue() > p2Card.getValue()) {
					playerOne.addPoint();
					System.out.println("Round " + i + ": Winner is " + playerOne.getName());
				}else if (p2Card.getValue() > p1Card.getValue()) {
					playerTwo.addPoint();
					System.out.println("Round " + i + ": Winner is " + playerTwo.getName());
				}else { 
					System.out.println("Round number " + i + " is a tie. No points added.");
				}
				System.out.println(playerOne.getName() + ": " + playerOne.getScore() + " vs. " + playerTwo.getName() + ": " + playerTwo.getScore()); 
				System.out.println("");
			}
			
			/* Print the final score of each player and either "Player 1", or "Player 2", or "Draw"
			 * depending on whose score was higher/the same
			 */
			if (playerOne.getScore() < playerTwo.getScore()) {
				System.out.println("The winner of this WAR is... " + playerTwo.getName() + "!!!");
				System.out.println("The final score is: " + playerTwo.getName() + ": " + playerTwo.getScore() + ", " + playerOne.getName() + ": " + playerOne.getScore());
				System.out.println("Better luck next time " + playerOne.getName() + " ;)");
			} else if (playerTwo.getScore() < playerOne.getScore()) {
				System.out.println("The winner of this WAR is... " + playerOne.getName() + "!!!");
				System.out.println("The final score is: " + playerOne.getName()+ ": " + playerOne.getScore() + " " + playerTwo.getName() +": " + playerTwo.getScore());
				System.out.println("Better luck next time " + playerTwo.getName() + " ;)");
			} else {
				System.out.println("This game is a Draw! The score is 26 : 26");
			}
		}
		
		
		
	}

}
