package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// �Ŀ�� ������
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		
		System.out.println(powderPrinter);
		
		// �ö�ƽ ������
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic Plastic = new Plastic();
		plasticPrinter.setMaterial(Plastic);
		
		System.out.println(plasticPrinter);
		
		powderPrinter.printing();
		plasticPrinter.printing();
	}

}
