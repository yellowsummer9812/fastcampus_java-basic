package ifexample;


public class IfExample2 {
	
	public static void main(String[] args) {
	
			int age = 10;
			
			int charge = 0;
			
			if ( age < 8) {
				charge = 1000;
			}else if(age < 14) {
				charge = 1500;
			}else if( age < 20) {
				charge = 2000;
			}else {
				charge = 3000;
			}
			System.out.println("���� : " + age);
			System.out.println("��� : " + charge);

		}

}
