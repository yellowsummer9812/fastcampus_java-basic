package streampractice;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer Lee = new Customer(1, "�̼���", 40, 100);
		Customer Kim = new Customer(2, "������", 20, 100);
		Customer Hong = new Customer(3, "ȫ�浿", 13, 50);
		
		customerList.add(Lee);
		customerList.add(Kim);
		customerList.add(Hong);
		
		System.out.println("�� ���");
		customerList.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		System.out.println("�� ��� : " + customerList.stream().map(s->s.getCost()).reduce(0, (a, b) -> a + b));
		// System.out.println("�� ��� : " + customerList.stream().mapToInt(c->c.getPrice()).sum());
		customerList.stream().filter(s->s.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));

	}

}
