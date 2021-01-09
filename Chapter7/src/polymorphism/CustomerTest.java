package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		Customer vip = new VIPCustomer(10001, "�强��" , 101);
		Customer gold1 = new GoldCustomer(10002, "�嵿ö");
		Customer gold2 = new GoldCustomer(10003, "�κ���");
		Customer silver1 = new Customer(10004,"������");
		Customer silver2 = new Customer(10005, "��ҿ�");
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(vip);
		customerList.add(gold1);
		customerList.add(gold2);
		customerList.add(silver1);
		customerList.add(silver2);
		
		System.out.println("======ȸ�� ����======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName() + "���� ���� �ݾ��� " + customer.calcPrice(10000) + "�̸�, ������ ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�Դϴ�.");
			
		}
	}

}
