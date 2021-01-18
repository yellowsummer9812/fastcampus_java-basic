package coffee;

public class Latte extends Decorator{

	public Latte(Coffee coffee) { // 꼭 하나의 커피를 가져오게 됨
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("  Adding Milk");
	}

}
