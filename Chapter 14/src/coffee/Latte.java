package coffee;

public class Latte extends Decorator{

	public Latte(Coffee coffee) { // �� �ϳ��� Ŀ�Ǹ� �������� ��
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("  Adding Milk");
	}

}
