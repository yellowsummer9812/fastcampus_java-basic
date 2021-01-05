package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1,"Lee");
		studentLee.korea.setSubject("korea", 100);
		studentLee.math.setSubject("math", 95);
		
		Student studentKim = new Student(2, "Kim");
		studentKim.korea.setSubject("korea", 100);
		studentKim.math.setSubject("math", 100);
		
		studentLee.showScore();
		studentKim.showScore();
	}

}
