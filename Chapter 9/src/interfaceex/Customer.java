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

	
	// 특정 interface의 order를 사용하든, 재정의해서 사용하든 하면 된다.
	@Override
	public void order() {
		System.out.println("customer order");
	}

	public void sayHello() {
		System.out.println("hello");
	}
}
