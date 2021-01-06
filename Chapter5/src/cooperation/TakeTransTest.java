package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentKim = new Student("Kim", 5000);
		Student studentChang = new Student("Chang", 2500);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway subwayOrange = new Subway(3);
		Subway subwayGreen = new Subway(2);
		
		studentKim.takeBus(bus100);
		studentChang.takeSubway(subwayGreen);
		
		studentKim.showInfo();
		studentChang.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		subwayOrange.showSubwayInfo();
	}

}
