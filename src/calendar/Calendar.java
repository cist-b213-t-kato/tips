package calendar;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	public static final int[] dmArray = {
			31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	public static int dm(int year, int month){
		if(year%4==0 && month==2){
			return 29;
		}
		return dmArray[month-1];
	}
	
	public Calendar(int year, int month, int day){
		
		if(month<1 || month>12){
			throw new RuntimeException("月の指定が不正です");
		}
		if(day < 1 || day > dm(year, month)){
			throw new RuntimeException("日付の指定が不正です");
		}
		
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
}
