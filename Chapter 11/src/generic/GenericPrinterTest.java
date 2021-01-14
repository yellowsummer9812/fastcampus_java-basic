package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// 파우더 프린터
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		
		System.out.println(powderPrinter);
		
		// 플라스틱 프린터
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic Plastic = new Plastic();
		plasticPrinter.setMaterial(Plastic);
		
		System.out.println(plasticPrinter);
		
		powderPrinter.printing();
		plasticPrinter.printing();
	}

}
