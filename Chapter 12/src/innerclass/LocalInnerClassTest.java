package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
	
		int num = 100;
		class MyRunnable implements Runnable{

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
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	
	}

}
