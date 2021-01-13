package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int devide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); // (java 9)
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		mystaticMethod(); // (java 9)
		return total;
	}
	
	// 이 클래스 내부에서 사용하면 됨 (java 9)
	private void myMethod() {
		System.out.println("private method");
	}
	
	// 이 클래스 내부의 static 메서드 내에서 사용하면 됨(java 9)
	private static void mystaticMethod() {
		System.out.println("private static method");
	}
}
