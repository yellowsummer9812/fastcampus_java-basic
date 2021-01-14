package innerclass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
	
		int num = 100;
		return new Runnable() {

			@Override
			public void run() {
				
				// 메서드 안에서 inner Class 사용할 때는 지역변수들은 상수취급(변경할 수 없음)
				/*
				num += 10;
				i = 200;
				*/
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {

		Outer2 outer = new Outer2();
		outer.runner.run(); // 익명 내부 클래스
		
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	
	}

}
