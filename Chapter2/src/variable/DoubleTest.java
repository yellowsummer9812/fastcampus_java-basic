package variable;

public class DoubleTest {

	public static void main(String[] args) {
		
		double dnum = 3.14;
		
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		// �ε� �Ҽ���
		double dNum = 1;
		for(int i = 0; i < 10000; i++) {
			dNum += 0.1;
		}
		
		System.out.println(dNum); // �ε��Ҽ��� ���� �߻�
	}

}
