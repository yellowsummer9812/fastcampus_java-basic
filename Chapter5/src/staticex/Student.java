package staticex;

public class Student { // �� JAVA���� �ȿ� public�� �ϳ��� �־���Ѵ�. ���� �̸��� public Ŭ������ ���ƾ���.
	
	// ��� ����
	private static int serialNum = 1000;
	public static int getSerialNum() {
		return serialNum;
	}

	private int studentID;
	public String studentName;
	public String address;
	
	public Student (String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּҾ���";
		serialNum++;
		studentID = serialNum;
	}
	
	// �޼���
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	
}
