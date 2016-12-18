package calendar;

import java.util.stream.IntStream;

public class CalendarUtils {
	
	public static int dow(Calendar calendar){

		int year = calendar.getYear();
		int month = calendar.getMonth();
		int day = calendar.getDay();
		
		int de = ( month>2 && year%4==0)? 1 : 0;
		int sd = IntStream.range(0, month-1).map(i->Calendar.dmArray[i]).sum();
		
		int d = (int) (365.25 * (year-1) ) + sd + de + day - 1 ;
		
		return d % 7;
		
	}
	
	private static final String[] dowArray = {
		"日", "月", "火", "水", "木", "金", "土"	
	};
	
	public static void main(String[] args) {
		System.out.println(dowArray[dow(new Calendar(2012, 2, 29))]);
	}
	
}
