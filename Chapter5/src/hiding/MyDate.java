package hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			isValid = false;
		}else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}

	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
	}
	
}
