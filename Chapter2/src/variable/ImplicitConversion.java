package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum; // ������ �� ��ȯ
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 30;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		System.out.println(dNum);
	}

}
