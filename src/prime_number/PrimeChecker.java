package prime_number;

public class PrimeChecker {

	public static void main(String[] args) {

		// IntStream stream = IntStream.range(0, 100);
		//
		// stream.forEach(i->{
		// if(MyMath.isPN(i*6-1)){
		// System.out.print(i*6-1 + " ");
		// }
		// if(MyMath.isPN(i*6+1)){
		// System.out.print(i*6+1 + " ");
		// }
		// });

		long t = System.currentTimeMillis();

		System.out.print(2+" "+3+" ");
		for (int i = 1; i * 6 - 1 < 10000000; ++i) {
			if (PrimeChecker.isPN(i * 6 - 1)) {
				System.out.print(i*6-1 + " ");
			}
			if (PrimeChecker.isPN(i * 6 + 1)) {
				System.out.print(i*6+1 + " ");
			}
			if (i % 20 == 0) {
				System.out.println();
			}
		}

		t = System.currentTimeMillis() - t;

		System.out.println("\n" + t + "msec");

	}

	public static boolean isPN(int number) {
		if (number == 2 || number == 3 || number == 5) {
			return true;
		}
		if (number % 6 != 1 && number % 6 != 5) {
			return false;
		}
		if (number % 5 == 0) {
			return false;
		}
		for (int i = 1; i <= number / 6; ++i) {
			if (6 * i + 1 > Math.sqrt(number)) {
				return true;
			}
			if (number % (6 * i + 1) == 0 || number % (6 * i + 5) == 0) {
				return false;
			}
		}

		return number != 1;
	}

}
