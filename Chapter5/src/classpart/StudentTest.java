package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("�̼���"); 
		//studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(2, "�迵��");
		//studentKim.studentName = "�迵��";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		// ���� ������ ���� ����غ��� ���� ������ ����Ű���ִ� �ּҰ��� �� �� �ִ�.
		//System.out.println(studentLee);
		//System.out.println(studentKim);
	}

}
