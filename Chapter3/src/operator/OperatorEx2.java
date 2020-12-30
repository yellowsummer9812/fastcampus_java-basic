package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		
		int num1 = 5 % 3;
		System.out.println(num1); // 2
 
		int n = 10;
		n += 2;
		System.out.println(n); // 12
		
		int num2 = 10;
		System.out.println(num2++); // 10
		System.out.println(++num2); // 12
	}

}
