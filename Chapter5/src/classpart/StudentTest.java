package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("이순신"); 
		//studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(2, "김영태");
		//studentKim.studentName = "김영태";
		studentKim.address = "서울";
		
		studentKim.showStudentInfo();
		
		// 참조 변수를 직접 출력해보면 참조 변수가 가리키고있는 주소값을 알 수 있다.
		//System.out.println(studentLee);
		//System.out.println(studentKim);
	}

}
