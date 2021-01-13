package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int devide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
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
	
	// �� Ŭ���� ���ο��� ����ϸ� �� (java 9)
	private void myMethod() {
		System.out.println("private method");
	}
	
	// �� Ŭ���� ������ static �޼��� ������ ����ϸ� ��(java 9)
	private static void mystaticMethod() {
		System.out.println("private static method");
	}
}
