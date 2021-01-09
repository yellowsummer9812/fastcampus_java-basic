package polymorphism;

public class VIPCustomer extends Customer{

	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID,customerName); // 상위클래스 생성자 명시적 호출
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override
	public String showCustomerInfo() {
		return (super.showCustomerInfo() + "그리고 상담원의 ID는 " + agentID + "입니다." );
	}
	
	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
}
