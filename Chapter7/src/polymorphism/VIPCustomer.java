package polymorphism;

public class VIPCustomer extends Customer{

	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID,customerName); // ����Ŭ���� ������ ����� ȣ��
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override
	public String showCustomerInfo() {
		return (super.showCustomerInfo() + "�׸��� ������ ID�� " + agentID + "�Դϴ�." );
	}
	
	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
}
