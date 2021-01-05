package reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	Subject eng;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject();
		math = new Subject();
		eng = new Subject();
	}
	
	public void showScore() {
		System.out.println(studentName + "�� ���� ���� : " + korea.score + "��");
		System.out.println(studentName + "�� ���� ���� : " + math.score + "��");
		
	}
}
