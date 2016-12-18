package prime_number.el;

public class PNApp {
	public static void main(String[] args) {
		for (int i = -1; i < 100; ++i) {
			if (PNApp.isPN(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPN(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n >= 2;
	}

}
