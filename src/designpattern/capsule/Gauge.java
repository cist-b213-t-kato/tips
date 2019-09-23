package designpattern.capsule;

public class Gauge {
    private int value;

    public void set(int value) {
        if (value >= 0 && value <= 500) {
            this.value = value;
        }
    }

    public int get() {
        return value;
    }

}
