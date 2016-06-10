import java.math.BigDecimal;
import java.text.DecimalFormat;

public class App2 {
	public static void main(String[] args) {

//		String value1 = "CodeIQ";
//		String value2 = "CodeIQ";
//		String value3 = new String("CodeIQ");
//		System.out.println(value1.equals(value3));
		
		DecimalFormat df = new DecimalFormat(",###.#");
		System.out.println(df.format(new BigDecimal("0.0")));
		
	}
}
