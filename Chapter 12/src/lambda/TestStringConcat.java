package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		// ���� �츮�� ����ߴ� ��� : interface�� �ִ� �޼��� ������ Ŭ���� ���� �ΰ� �ν��Ͻ� �����ؼ�..
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		// ���ٽ� ���
		StringConcat concat = (s1, s2) -> System.out.println(s1 + "," + s2);
		concat.makeString("hello", "world");
		
		// ���ٽ� ���ư��� ��� -> �͸� ���� Ŭ����
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
		concat2.makeString("hello", "world");
		
		
	}

}
