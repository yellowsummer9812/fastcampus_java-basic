package classpart;

public class PersonTest {

	public static void main(String[] args) {
		
		Person James = new Person();
		James.age = 40;
		James.personName = "James";
		James.isMerried = true;
		James.numOfChildren = 3;
		
		System.out.println("���� : " + James.age);
		System.out.println("�̸� : " + James.personName);
		System.out.println("��ȥ���� : "+ James.isMerried);
		System.out.println("�ڳ� �� : " + James.numOfChildren);
	}

}
