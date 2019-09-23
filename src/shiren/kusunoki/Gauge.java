package shiren.kusunoki;

public class Gauge {
    private int value;

    public Gauge(int value) {
        if (value >= 0 && value < 1000) {
            this.setValue(value);
        }

    }

    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        if (value >= 0 && value < 1000) {
            this.value = value;
        }
    }
}
