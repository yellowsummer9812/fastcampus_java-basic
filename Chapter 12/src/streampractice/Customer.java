package streampractice;

public class Customer {

	private int id;
	private String name;
	private int age;
	private int cost;
	
	public Customer(int id, String name, int age, int cost) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return name + ", " + age + ", " + cost; 
	}
	
	
}
