package stringrule;

public class StringBuilderApp {

	/** わかる */
	public static void pattern1() {
		String str = "しゃぶしゃぶ";
		StringBuilder sb = new StringBuilder(str);
		sb.append("しゃぶしゃぶ！");
		System.out.println(sb);
	}

	/** なぜなのか */
	public static void pattern2() {
		String str = "しゃぶしゃぶしゃぶしゃぶ！";
		StringBuilder sb = new StringBuilder(str);
		sb.substring(3, 9);
		System.out.println(sb);
	}

	public static void main(String[] args) {
		pattern1();
		pattern2();
	}
}
