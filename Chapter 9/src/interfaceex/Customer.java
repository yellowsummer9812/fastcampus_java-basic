package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {

		System.out.println("customer sell");
	}

	@Override
	public void buy() {

		System.out.println("customer buy");
	}

	
	// Ư�� interface�� order�� ����ϵ�, �������ؼ� ����ϵ� �ϸ� �ȴ�.
	@Override
	public void order() {
		System.out.println("customer order");
	}

	public void sayHello() {
		System.out.println("hello");
	}
}
