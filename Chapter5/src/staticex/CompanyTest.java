package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		// 똑같은 주소 반환(singleton pattern이기 때문!)
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();
	}

}
