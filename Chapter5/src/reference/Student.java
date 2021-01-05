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
		System.out.println(studentName + "의 국어 점수 : " + korea.score + "점");
		System.out.println(studentName + "의 수학 점수 : " + math.score + "점");
		
	}
}
