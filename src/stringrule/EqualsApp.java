package stringrule;

/**
 * String の equals の仕様
 * @author tkato
 *
 */
public class EqualsApp {
	public static void main(String[] args) {

		String a = "100";
		String b = "100";
		String c = new String("100");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

	}
}
