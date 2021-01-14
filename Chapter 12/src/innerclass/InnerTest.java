package innerclass;

import innerclass.OutClass.InClass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{ // �ν��Ͻ� ���� Ŭ����
		int iNum = 100;
		
		void inTest() {
			System.out.println(num); // OutClass�� private ���� ��� ����
			System.out.println(sNum);
		}
	}
	
	public void usingInner() { // ���� ���� Ŭ����
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		// �ܺο��� InClass ���� ������ �� ���� statement(private�� �ƴ� ���) -> �� �� ����
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		System.out.println();

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();
	}

}
