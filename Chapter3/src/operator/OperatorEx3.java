package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		// 단락 회로 평가 예시
		boolean value1 = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(num1); // 20
		System.out.println(i); // 2
		System.out.println(value1); // false
		
		boolean value2 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(num1); // 30
		System.out.println(i); // 4
		System.out.println(value2); // true
		
		// 조건 연산자
		int num2 = 10;
		int num3 = 20;
		
		int max = ((num2 > num3)? num2: num3);
		System.out.println(max); // 20
	}

}
