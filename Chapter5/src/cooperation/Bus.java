package cooperation;

public class Bus {

	int busNum;
	int passengerCount;
	int money;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) { // ����
		this.money += money;
		this.passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNum + "�� ������ �°��� " + passengerCount + "�� �̰�, ������ " + money + "�Դϴ�." );
	}
}
