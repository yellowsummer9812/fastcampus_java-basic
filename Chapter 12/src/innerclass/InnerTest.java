package innerclass;

import innerclass.OutClass.InClass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{ // 인스턴스 내부 클래스
		int iNum = 100;
		
		void inTest() {
			System.out.println(num); // OutClass의 private 변수 사용 가능
			System.out.println(sNum);
		}
	}
	
	public void usingInner() { // 정적 내부 클래스
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
		
		// 외부에서 InClass 직접 참조할 때 쓰는 statement(private이 아닌 경우) -> 잘 안 쓰임
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		System.out.println();

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();
	}

}
