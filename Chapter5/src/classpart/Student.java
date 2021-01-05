package classpart;

public class Student { // 한 JAVA파일 안에 public은 하나만 있어야한다. 파일 이름과 public 클래스명 같아야함.
	
	// 멤버 변수
	public int studentID;
	public String studentName;
	public String address;
	
	public Student (String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소없음";
	}
	
	// 메서드
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
