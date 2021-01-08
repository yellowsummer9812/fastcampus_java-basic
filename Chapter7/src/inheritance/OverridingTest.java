package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer Lee = new Customer(10010, "�̼���");
		Lee.bonusPoint = 1000;
		
		VIPCustomer Kim = new VIPCustomer(10020,"������");
		Kim.bonusPoint = 10000;
		
		int priceLee = Lee.calcPrice(10000);
		int priceKim = Kim.calcPrice(10000);
		
		System.out.println(Lee.showCustomerInfo() + "���ұݾ��� " + priceLee + "�� �Դϴ�.");
		
		System.out.println(Kim.showCustomerInfo() + "���ұݾ��� " + priceKim + "�� �Դϴ�.");
		
		Customer Na = new VIPCustomer(10030, "������");
		Na.bonusPoint = 10000;
		System.out.println(Kim.showCustomerInfo() + "���ұݾ��� " + Na.calcPrice(10000) + "�� �Դϴ�.");
		
	}

}
