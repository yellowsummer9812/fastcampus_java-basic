package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

		Customer Lee = new Customer();
		Lee.setCustomerName("�̼���");
		Lee.setCustomerID(100010);
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());
		
		VIPCustomer Kim = new VIPCustomer();
		Kim.setCustomerName("������");
		Kim.setCustomerID(100020);
		Kim.bonusPoint = 10000;
		System.out.println(Kim.showCustomerInfo());
	}

}
