package practice;

class MyDate{
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public int hashCode() {
		int sum = this.day + this.month + this.year;
		return sum;
	}

	@Override
	public boolean equals(Object obj) {
		MyDate myDate = (MyDate)obj;
		return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
	}
	
}

public class MyDateTest {

	public static void main(String[] args) {
		MyDate m1 = new MyDate(21, 11, 2021);
		MyDate m2 = new MyDate(01, 29, 2021);
		MyDate m3 = new MyDate(21, 11, 2021);
		
		// equals()
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		
		// hashCode()
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
	}

}
