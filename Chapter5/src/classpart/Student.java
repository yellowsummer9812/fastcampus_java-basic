package classpart;

public class Student { // �� JAVA���� �ȿ� public�� �ϳ��� �־���Ѵ�. ���� �̸��� public Ŭ������ ���ƾ���.
	
	// ��� ����
	public int studentID;
	public String studentName;
	public String address;
	
	public Student (String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּҾ���";
	}
	
	// �޼���
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
