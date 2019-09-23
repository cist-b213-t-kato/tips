package date;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Gold紫本模試42
 * @author tkato
 *
 */
public class PeriodApp {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2020, 3, 3, 12, 35, 50);
//		Period p = Period.ofDays(1).ofYears(2);
		Period p = Period.ofDays(1);
//		Period p = Period.ofYears(2);
		date = date.minus(p);

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

		System.out.println(formatter.format(date));


	}
}
