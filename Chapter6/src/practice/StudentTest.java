package practice;

public class StudentTest {

	public static void main(String[] args) {

		Student Lee = new Student("Lee");
		Lee.addBook("�¹���1");
		Lee.addBook("�¹���2");
		
		Student Kim = new Student("Kim");
		Kim.addBook("����1");
		Kim.addBook("����2");
		Kim.addBook("����3");
		
		Student Cho = new Student("Cho");
		Cho.addBook("�ظ�����1");
		Cho.addBook("�ظ�����2");
		Cho.addBook("�ظ�����3");
		Cho.addBook("�ظ�����4");
		Cho.addBook("�ظ�����5");
		Cho.addBook("�ظ�����6");
		
		Lee.showStudentInfo();
		Kim.showStudentInfo();
		Cho.showStudentInfo();
		
	}

}
