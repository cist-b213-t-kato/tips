package prime_number;

public class PNApp3 {
	public static void main(String[] args) {
		/// *
		int count = 0;
		for (int i = -1; i < 100; ++i) {
			if (PNApp3.isPN(i)) {
				System.out.print(i + " ");
//				if ((++count) % 20 == 0) {
//					System.out.println();
//				}
			}
		}
		/*
		 * int n = 1; if(isPN(n)){ System.out.println(n + "は素数です"); }else{
		 * System.out.println(n + "は素数ではありません"); }
		 */

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
