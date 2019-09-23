package shiren.kusunoki;

public class Tree extends Execute {

    private int max;

    public Tree(int i) {
        Gauge gauge = new Gauge(i);
        max = gauge.getValue();
    }

    //1からmaxまでの段数でTree表示
    public void execute() {
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
