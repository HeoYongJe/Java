
public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date() {
		year = 2020;
		month = 2;
		day = 22;
	}
	
	public Date(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {
		if(year < 1970)
			year = 1970;
		this.year = year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setMonth(int month) {
		if(month <= 0 || month > 12)
			month = 1;
		this.month = month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setDay(int day) {
		int [] days = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
		if(day <= 0 || day > days[month-1])
			day = 1;
		this.day = day;
	}
	
	public void displayDate() {
		System.out.printf("%04d-%02d-%02d\n", year, month, day);
	}
}
