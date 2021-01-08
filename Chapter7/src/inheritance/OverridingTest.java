package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer Lee = new Customer(10010, "이순신");
		Lee.bonusPoint = 1000;
		
		VIPCustomer Kim = new VIPCustomer(10020,"김유신");
		Kim.bonusPoint = 10000;
		
		int priceLee = Lee.calcPrice(10000);
		int priceKim = Kim.calcPrice(10000);
		
		System.out.println(Lee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		
		System.out.println(Kim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");
		
		Customer Na = new VIPCustomer(10030, "나몰라");
		Na.bonusPoint = 10000;
		System.out.println(Kim.showCustomerInfo() + "지불금액은 " + Na.calcPrice(10000) + "원 입니다.");
		
	}

}
