package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		// 원래 우리가 사용했던 방식 : interface에 있는 메서드 구현한 클래스 따로 두고 인스턴스 생성해서..
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		// 람다식 사용
		StringConcat concat = (s1, s2) -> System.out.println(s1 + "," + s2);
		concat.makeString("hello", "world");
		
		// 람다식 돌아가는 방식 -> 익명 내부 클래스
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
		concat2.makeString("hello", "world");
		
		
	}

}
