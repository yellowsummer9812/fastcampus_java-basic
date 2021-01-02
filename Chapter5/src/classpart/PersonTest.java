package classpart;

public class PersonTest {

	public static void main(String[] args) {
		
		Person James = new Person();
		James.age = 40;
		James.personName = "James";
		James.isMerried = true;
		James.numOfChildren = 3;
		
		System.out.println("나이 : " + James.age);
		System.out.println("이름 : " + James.personName);
		System.out.println("결혼여부 : "+ James.isMerried);
		System.out.println("자녀 수 : " + James.numOfChildren);
	}

}
