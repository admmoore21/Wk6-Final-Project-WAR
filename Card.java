package wk6FinalProjectWAR;

public class Card {
//Fields
	private int value;
	private String name;

//Constructors
	public Card() {};
	
	public Card(int value, String suit) {
		switch (value) {
		case 0:
			setName("Two");
			break;
		case 1:
			setName("Three");
			break;
		case 2:
			setName("Four");
			break;
		case 3:
			setName("Five");
			break;
		case 4:
			setName("Six");
			break;
		case 5:
			setName("Seven");
			break;
		case 6:
			setName("Eight");
			break;
		case 7:
			setName("Nine");
			break;
		case 8:
			setName("Ten");
			break;
		case 9:
			setName("Jack");
			break;
		case 10:
			setName("Queen");
			break;
		case 11:
			setName("King");
			break;
		case 12:
			setName("Ace");
			break;
		}
		setName(getName() + " of " + suit + ".");
		this.value = value;
	}
// Methods (Describe)
	public void describe() {
		System.out.println("The " + name);
	}
	
//Setters and Getters
	public void setName(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
