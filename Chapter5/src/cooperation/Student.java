package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 객체 협업 구현
	public void takeBus(Bus bus) { // 어떤 버스를 탈지 매개변수로 받기
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {// 어떤 지하철을 탈지 매개변수로 받기
		subway.take(1050);
		this.money -= 1050;
	}
	// 여기까지 객체 협업
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
