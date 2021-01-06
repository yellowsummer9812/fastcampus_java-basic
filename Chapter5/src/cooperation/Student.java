package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// ��ü ���� ����
	public void takeBus(Bus bus) { // � ������ Ż�� �Ű������� �ޱ�
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {// � ����ö�� Ż�� �Ű������� �ޱ�
		subway.take(1050);
		this.money -= 1050;
	}
	// ������� ��ü ����
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�.");
	}
}
