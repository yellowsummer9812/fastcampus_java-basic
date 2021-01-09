package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		Customer vip = new VIPCustomer(10001, "장성희" , 101);
		Customer gold1 = new GoldCustomer(10002, "장동철");
		Customer gold2 = new GoldCustomer(10003, "민병애");
		Customer silver1 = new Customer(10004,"장재희");
		Customer silver2 = new Customer(10005, "장소영");
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(vip);
		customerList.add(gold1);
		customerList.add(gold2);
		customerList.add(silver1);
		customerList.add(silver2);
		
		System.out.println("======회원 정보======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName() + "님의 지불 금액은 " + customer.calcPrice(10000) + "이며, 적립된 보너스 포인트는 " + customer.bonusPoint + "입니다.");
			
		}
	}

}
