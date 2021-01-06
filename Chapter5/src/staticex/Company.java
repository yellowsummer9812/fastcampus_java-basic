package staticex;

public class Company {
	
	private static Company instance = new Company(); // 내부에 자기 자신의 instance 만듦, 유일

	private Company() {}
	
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
		
	}
	
	
}
