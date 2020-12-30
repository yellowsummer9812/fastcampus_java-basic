package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

		int num1 = 0b00001010; // 10
		int num2 = 0b00000101; // 5
		
		
		System.out.println(num1 & num2); // 0
		System.out.println(num1 | num2); // 15
		System.out.println(num1 ^ num2); // 15
		
		System.out.println(num2 << 1); // 10
		System.out.println(num2 << 2); // 20
		System.out.println(num1 >> 1); // 5
	}

}
