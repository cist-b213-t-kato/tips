package shiren.kusunoki;

public class PrimeNumbers extends Execute {

    private int max;

    public PrimeNumbers(int i) {
        Gauge gauge = new Gauge(i);
        max = gauge.getValue();
    }

    //maxまでの素数を表示
    public void execute() {
        for (int i = 2; i <= max; i++) {
            for (int j = 2; (i % j != 0 && j < i) || j == i; j++) {
                if (j == i) {
                    System.out.println(i + "は素数です。");
                }
            }
        }
    }
}
