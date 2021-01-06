package practice;

public class CardCompany {
	
	private CardCompany() {}
	
	private static CardCompany company = new CardCompany();

	public static CardCompany getInstance() {
		if(company == null) {
			company = new CardCompany();
		}
		return company;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
