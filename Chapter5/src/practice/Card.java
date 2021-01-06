package practice;

public class Card {

	private static int serialNum = 10000;
	int cardNum;
	
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}

	public int getCardNumber() {
		return cardNum;
	}
	
	
}
