package cooperation;

public class Subway {

	int lineNum;
	int passengerCount;
	int money;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNum + "����ö�� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�Դϴ�.");
	}
}
