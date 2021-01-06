package staticex;

public class Company {
	
	private static Company instance = new Company(); // ���ο� �ڱ� �ڽ��� instance ����, ����

	private Company() {}
	
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
		
	}
	
	
}
