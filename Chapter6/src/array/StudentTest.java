package array;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		
		Student studentKim = new Student(2, "Kim");
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 80);		
		
		studentLee.showStudentInfo();
		System.out.println("===========");
		studentKim.showStudentInfo();
	}

}
