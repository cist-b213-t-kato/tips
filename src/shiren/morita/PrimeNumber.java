package shiren.morita;

public class PrimeNumber extends Execute {

	Gauge gauge = new Gauge();

	public PrimeNumber(int value) {
		gauge.setValue(value);
	}

	public void execute() {

		System.out.println("---Prime Number---");
		for (int i = 2; i <= 30; i++) {
			for (int j = 2; (i % j != 0 && j < i) || j == i; j++) {
				if (j == i) {
					System.out.println(i);
				}
			}

		}
		System.out.println("-------------------");
	}
}
