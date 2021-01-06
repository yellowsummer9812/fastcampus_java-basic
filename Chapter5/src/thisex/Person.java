package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		// this로 다른 생성자를 호출할 때는 그 statement가 first statement여야 한다.
		this("이름 없음", 1);
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	public Person getSelf() {
		return this;
	}
}
